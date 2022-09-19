package com.softserve.edu;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Date;

@WebFilter(value = "/*")
public class FilterDemo implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("***Filter INIT");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //String ipAddress = request.getRemoteAddr();
        //String dateTime = new Date().toString();

        System.out.println("***Filter Start");

        if ((request.getParameter("box") != null)
                && (request.getParameter("box").length() > 10)) {
            System.out.println("***Filter ERROR");
            response.getWriter().println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "<head><title>A Test Servlet</title></head>\n"
                    + "<body bgcolor=\"#fdf5e6\">\n"
                    + "<h1>Test</h1>\n"
                    + "<p>Simple servlet for testing.</p>\n"
                    + "</body></html>");
            response.getWriter().close();
        } else {
            chain.doFilter(request, response);
        }
    }

    public void destroy() {
        System.out.println("***Filter DONE");
    }

}
