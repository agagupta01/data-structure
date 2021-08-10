import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class restcallTest {

	public static void main(String[] args) {
		try {
			System.out.println("Start.................");
			URL url = new URL("https://jsonmock.hackerrank.com/api/moves/search/?Title=spiderman"); 
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			
	
			if(responsecode != 200)
			throw new RuntimeException();
			else
			{
			    System.out.println("Next part of the functionality");
			}
	
			String inline = null;
			Scanner sc = new Scanner(url.openStream());
			while(sc.hasNext())
			{
			inline+=sc.nextLine();
			}
			System.out.println("JSON data in string format");
			System.out.println(inline);
			sc.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
