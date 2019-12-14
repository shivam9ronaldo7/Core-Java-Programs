package basicPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLink {

	public static void main(String[] args) {
		//Storing URL as string
		String strURL = "https://www.google.com";
		
		try {
			//Converting String data type to URL
			URL url = new URL(strURL);
			
			//Using url's .openConnection() to get URLConnection
			// object and casting it to HttpURLConnection
			HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
			
			//Using .connect() to connect to url
			httpConn.connect();
			
			//Getting response message from .getResponseMessage()
			String a = httpConn.getResponseMessage();
			
			//Getting response code from .getResponseCode()
			int b = httpConn.getResponseCode();
			
			//Getting request method from .getRequestMethod()
			String c = httpConn.getRequestMethod();
			
			//Using .disconnect() to stop connection with url
			httpConn.disconnect();
			
			System.out.println("Response Message: "+a);
			System.out.println("Response Code: "+b);
			System.out.println("Request Method: "+c);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
