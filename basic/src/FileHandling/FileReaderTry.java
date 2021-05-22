package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader reader=new FileReader("yujan12.txt");
			int data= reader.read(); 							//Reads single char at a time in a int format.
			while(data!=-1) {
				System.out.print((char)data);					//Type casting int to char type.
				data=reader.read();
			}
			
			reader.close();
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
