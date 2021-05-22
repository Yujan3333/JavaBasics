package basic;

/* Using Multiple class and creating certain objects */

class Main1 {
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }
	public void max(int a) {
		System.out.println("Max is "+ a);
	}
}

class Second12 {
public static void main(String[]args)
{
	Main1 obj= new Main1();
	obj.fullThrottle();
	obj.max(20);
}
}


