

/* Basic use of Scanner Class and java.util package */

package class1;
import java.util.Scanner;




public class Read {
	public static void main(String[]args) {
		String name;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name:");
		
		name=obj.next();
		System.out.println("\n\n\t\t" +name);
		
		
	}
}
