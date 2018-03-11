import java.net.*;
import java.io.*;
import java.util.Scanner;

public class webAccess{
	public static void main(String[] args) throws Exception{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter a url: ");

		URL u = new URL(inp.nextLine());
		URLConnection myuConnect = u.openConnection();
		myuConnect.connect();
		BufferedReader in = new BufferedReader(new InputStreamReader(myuConnect.getInputStream()));
        	String inputLine;
        	while ((inputLine = in.readLine()) != null)
            		System.out.println(inputLine);
        	in.close();
	}

}
