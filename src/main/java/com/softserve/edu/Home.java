package com.softserve.edu;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet(name = "Home", value = {"/Home", "/home", "/"})
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
    //
    private String box = ""; // Architecture Error


    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        super.init(config);
        //
        System.out.println("\t***public void init(ServletConfig config) done");
    }

    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("\t***public void destroy() done");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Map.Entry<String, String[]> param : requestParams.entrySet()) {
            System.out.println(param.getKey() + " => " + Arrays.toString(param.getValue()));
        }
        //
        if ((request.getParameter("box") != null)
                && (!request.getParameter("box").isEmpty())) {
            box = request.getParameter("box");
        }
        //
        response.setContentType("text/html; charset=UTF-8");
        //response.setContentType("application/zip");
        PrintWriter out = response.getWriter();
        //
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello</h1><br><br><br>");
        out.println("<br><font size=\"5\" color='red'> URL = " + request.getRequestURL().toString() + "</font><br>");
        out.println("<br><font size=\"5\" color='green'> URI = " + request.getRequestURI().toString() + "</font><br>");
        if (box.length() > 0) {
            out.println("<br><br>box = " + box + "<br><br><br>");
        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
