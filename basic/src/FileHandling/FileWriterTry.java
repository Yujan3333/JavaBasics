package FileHandling;


import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriterTry {
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[]args) throws FileNotFoundException 
	{
		
		
		
		try {
			FileWriter writer = new FileWriter("yujan12.txt");
			writer.write("My name is Yujan. \n I read in class Bachelor.");
			writer.append("(By Yujan)");
			writer.close();
			} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
