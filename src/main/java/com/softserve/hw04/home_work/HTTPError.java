package com.softserve.hw04.home_work;



public enum HTTPError {

    ERROR400 ("Bad Request",400){
        public String nameError() {
            return getName();
        }
    },

    ERROR401 ("Unauthorized",401){
        public String nameError() {
            return getName();
        }
    },

    ERROR402 ("Payment Required Experimental",402){
        public String nameError() {
            return getName();
        }
    },

    ERROR403 ("Forbidden",403){
        public String nameError() {
            return getName();
        }
    },

    ERROR404 ("Not Found",404){
        public String nameError() {
            return getName();
        }
    },

    ERROR405 ("Method Not Allowed",405){
        public String nameError() {
            return getName();
        }
    },

    ERROR406 ("Not Acceptable",406){
        public String nameError() {
            return getName();
        }
    },

    ERROR407 ("Proxy Authentication Required",407){
        public String nameError() {
            return getName();
        }
    },

    ERROR408 ("Request Timeout",408){
        public String nameError() {
            return getName();
        }
    },

    ERROR409 ("Conflict",409){
        public String nameError() {
            return getName();
        }
    },

    ERROR410 ("Gone",410){
        public String nameError() {
            return getName();
        }
    },

    ERROR411 ("Length Required",411){
        public String nameError() {
            return getName();
        }
    },

    ERROR412 ("Precondition Failed",412){
        public String nameError() {
            return getName();
        }
    },

    ERROR413 ("Payload Too Large",413){
        public String nameError() {
            return getName();
        }
    },

    ERROR414 ("URI Too Long",414){
        public String nameError() {
            return getName();
        }
    },

    ERROR415 ("Unsupported Media Type",415){
        public String nameError() {
            return getName();
        }
    },

    ERROR416 ("Range Not Satisfiable",416){
        public String nameError() {
            return getName();
        }
    },

    ERROR417 ("Expectation Failed",417){
        public String nameError() {
            return getName();
        }
    },

    ERROR418 ("I'm a teapot",418){
        public String nameError() {
            return getName();
        }
    },

    ERROR421 ("Misdirected Request",421){
        public String nameError() {
            return getName();
        }
    },

    ERROR422 ("Unprocessable Entity (WebDAV)",422){
        public String nameError() {
            return getName();
        }
    },

    ERROR423 ("Locked (WebDAV)",423){
        public String nameError() {
            return getName();
        }
    },

    ERROR424 ("Failed Dependency (WebDAV)",424){
        public String nameError() {
            return getName();
        }
    },

    ERROR425 ("Too Early Experimental",425){
        public String nameError() {
            return getName();
        }
    },

    ERROR426 ("Upgrade Required",426){
        public String nameError() {
            return getName();
        }
    },

    ERROR428 ("Precondition Required",428){
        public String nameError() {
            return getName();
        }
    },

    ERROR429 ("Too Many Requests",429){
        public String nameError() {
            return getName();
        }
    },


    ERROR431 ("Request Header Fields Too Large",431){
        public String nameError() {
            return getName();
        }
    },

    ERROR451 ("Unavailable For Legal Reasons",451){
        public String nameError() {
            return getName();
        }
    };
    private String name;
    private int number;
    private HTTPError(String name,int number) {
        this.name=name;
        this.number=number;

    }
    public String getName(){return name; }
//    public void find(int number){
//        HTTPError error=null;
//        switch (number) {
//            case 400:
//                error = HTTPError.ERROR400;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 401:
//          error = HTTPError.ERROR401;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 402:
//                error = HTTPError.ERROR402;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 403:
//                error = HTTPError.ERROR403;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 404:
//          //      error = HTTPError.ERROR404;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 405:
//          //      error = HTTPError.ERROR405;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 406:
//          //      error = HTTPError.ERROR406;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 407:
//          //      error = HTTPError.ERROR407;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 408:
//          //      error = HTTPError.ERROR408;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 409:
//           //     error = HTTPError.ERROR409;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 410:
//          //      error = HTTPError.ERROR410;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 411:
//          //      error = HTTPError.ERROR411;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 412:
//           //     error = HTTPError.ERROR412;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 414:
//            //    error = HTTPError.ERROR414;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 415:
//            //    error = HTTPError.ERROR415;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 416:
//            //    error = HTTPError.ERROR416;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 417:
//            //    error = HTTPError.ERROR417;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 418:
//             //   error = HTTPError.ERROR418;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 421:
//             //   error = HTTPError.ERROR421;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 422:
//              //  error = HTTPError.ERROR422;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 423:
//             //   error = HTTPError.ERROR423;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 424:
//             //   error = HTTPError.ERROR424;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 425:
//             //   error = HTTPError.ERROR425;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 426:
//             //   error = HTTPError.ERROR426;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 428:
//               // error = HTTPError.ERROR428;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 429:
//              //  error = HTTPError.ERROR429;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 431:
//             //   error = HTTPError.ERROR431;
//                System.out.println("Name of error: "+nameError());
//                break;
//            case 451:
//              //  error = HTTPError.ERROR451;
//                System.out.println("Name of error: "+nameError());
//                break;
//
//            default:
//                System.out.println("No this error\n");
//                throw new IllegalArgumentException("Error: Invalid Argument");
//                // System.exit(0);
//
//
//        }
//    }

    public abstract  String nameError();
}
