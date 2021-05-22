package basic;

/* Use of the method in Class */


public class Main {
	
	static void myStatic(){
		System.out.println("HELLO");
	}
	
	public void myPublic(){
		System.out.println("\t\t\n\tLETS GO");
	}
	
	public static void main(String[]args)
	{
		myStatic();   // myStatic can be accessed directly without object creation
		// myPublic will give error as they need object
		
		Main obj1= new Main();
		obj1.myPublic();
		
		
	}

}
