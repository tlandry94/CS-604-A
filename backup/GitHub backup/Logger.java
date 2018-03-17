import java.io.*;
//package webappservices; webappservices is not yet available!

public class Logger implements Validator{
	private String fileName;
	
	@Override
	public Boolean validate(String... input){
		//validates user credentials.
		return false;
	}

	public void makeFile(String filename){
		this.fileName = filename;
		File f = new File(filename);
		if (!f.exists()){
			System.out.println("The filename entered does not exist! File will be created.");
			try{
				if (f.createNewFile())
					System.out.println("File created.");
				else	
					System.out.println("File could not be created.");
			} 
			catch(IOException e){
				System.out.println("Error caught.");
			}
		}
		else{
			System.out.println("The filename entered does exist and will not be created.");
		}
	}

	

}