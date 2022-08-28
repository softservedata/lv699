package homework3_1.HTTPErrorTask;

public class Run {
    public static void main(String[] args) {

        int error = 403;
        HTTPERR httpError = null;
        switch (error) {
            case 1400:
                httpError = HTTPERR.BAD_REQUEST;
                break;
            case 401:
                httpError = HTTPERR.UNAUTHORIZED_ERROR;
                break;
            case 402:
                httpError = HTTPERR.PAYMENT_REQUIRED;
                break;
            case 403:
                httpError = HTTPERR.FORBIDDEN;
                break;
            default:
                System.out.println("No such error");
                System.exit(0);
        }
        System.out.println(httpError);

    }
}


