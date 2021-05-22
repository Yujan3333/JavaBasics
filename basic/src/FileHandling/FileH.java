package FileHandling;
import java.io.File;

public class FileH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File name=new File("yujan12.txt");
		
		if(name.exists()) {
			System.out.println("The File exists::");
			name.getPath();
			name.getAbsoluteFile();
			name.length();
			name.delete();
		}
		else {
			System.out.println("The file doesnt exists !!!");
		}
		
	}

}
