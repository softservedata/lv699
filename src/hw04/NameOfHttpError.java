package hw04;


import java.util.Scanner;

public class NameOfHttpError {
    public static void main(String[] args) {
        int answerNumberHttpError;

        NameOfHttpError nameOfHttpError = new NameOfHttpError();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of Http error: ");
        answerNumberHttpError = scan.nextInt();
        System.out.println(nameOfHttpError.getError(answerNumberHttpError).toString());

    }
    public HttpError getError(int code){

        switch (code) {
            case 400:
                return HttpError.err400;
            case 401:
                return HttpError.err401;
            case 402:
                return HttpError.err402;
            case 403:
                return HttpError.err403;
            case 404:
                return HttpError.err404;
            default:
                return  HttpError.err0;
        }

    }

    enum HttpError {
        err400("Bad Request", 400), err401("Unauthorized", 401),
        err402("Payment Required", 402), err403("Forbidden", 403),
        err404("Not Found", 404), err0("Please enter an error number from 400 to 404", 0);

        private final String name;
        private final int code;

        HttpError(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public int getCode() {
            return code;
        }

        @Override
        public String toString() {
            return "Name error: " + getName() + ", Code error: " + getCode();
        }
    }
}
