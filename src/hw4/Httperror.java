package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Httperror {

	public static void main(String[] args) throws IOException {

		Httperror http = new Httperror();
		System.out.println(http.httpError());
	}

	public String httpError() throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter number of HTTP Error from 400 to 410: \n");
		String input = read.readLine();
		int intInput = Integer.parseInt(input);
		switch (intInput) {
		case 400:
			System.out.println(
					"Error 400 BadRequest - Equivalent to HTTP status 400. BadRequest indicates that the request could not be understood by the server. BadRequest is sent when no other error is applicable, or if the exact error is unknown or does not have its own error code");
			System.exit(intInput);
			break;
		case 401:
			System.out.println(
					"Error 401 Unauthorized - Equivalent to HTTP status 401. Unauthorized indicates that the requested resource requires authentication. The WWW-Authenticate header contains the details of how to perform the authentication.");
			System.exit(intInput);
			break;
		case 402:
			System.out
					.println("Error 402 - Equivalent to HTTP status 402. PaymentRequired is reserved for future use.");
			System.exit(intInput);
			break;
		case 403:
			System.out.println(
					"Error 403 - Equivalent to HTTP status 403. Forbidden indicates that the server refuses to fulfill the request.");
			System.exit(intInput);
			break;
		case 404:
			System.out.println(
					"Error 404 - Equivalent to HTTP status 404. NotFound indicates that the requested resource does not exist on the server.");
			System.exit(intInput);
			break;
		case 405:
			System.out.println(
					"Error 405  - Equivalent to HTTP status 405. MethodNotAllowed indicates that the request method (POST or GET) is not allowed on the requested resource.");
			System.exit(intInput);
			break;
		case 406:
			System.out.println(
					"Error 406  - Equivalent to HTTP status 406. NotAcceptable indicates that the client has indicated with Accept headers that it will not accept any of the available representations of the resource.");
			System.exit(intInput);
			break;
		case 407:
			System.out.println(
					"Error 407  - Equivalent to HTTP status 407. ProxyAuthenticationRequired indicates that the requested proxy requires authentication. The Proxy-authenticate header contains the details of how to perform the authentication.");
			System.exit(intInput);
			break;
		case 408:
			System.out.println(
					"Error 408  - Equivalent to HTTP status 408. RequestTimeout indicates that the client did not send a request within the time the server was expecting the request.");
			System.exit(intInput);
			break;
		case 409:
			System.out.println(
					"Error 409  - Equivalent to HTTP status 409. Conflict indicates that the request could not be carried out because of a conflict on the server.");
			System.exit(intInput);
			break;
		case 410:
			System.out.println(
					"Error 410  - Equivalent to HTTP status 410. Gone indicates that the requested resource is no longer available.");
			System.exit(intInput);
			break;
		default:
			System.out.println("I don't now what are you doing:-)))),");
		}
		return httpError();

	}
}
