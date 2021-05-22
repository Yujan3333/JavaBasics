package basic;
import java.util.ArrayList;

public class ForEachLoop {
 public static void main(String[]args) {
	 
	 String[] animal={ "Cat" ,"Dog" ,"Ant" };
	 for(String i : animal) 						/*ForEach Loop in Java */ 
	 {
		 System.out.println(i);
	 }
	 
	 ArrayList<String> bird=new ArrayList<String>(); /* By using ArrayList<String>  in For Each Loop */ 
	 bird.add("Daphe");
	 bird.add("2");
	 bird.add("3");
	 
	 for(String i : bird) {
		 System.out.println(i);
	 }
	 System.out.println(bird.size());
	 
 }
}
