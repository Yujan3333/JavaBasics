package basic;


public class ClassParameters {
	
	int x;
	public ClassParameters()
	{
		x=5;
	}
	
	public ClassParameters(int y) {
		x=y;
	}
	
	public static void main(String[]args) {
		
		ClassParameters obj=new ClassParameters();
		System.out.println(obj.x);
		
		ClassParameters obj1=new ClassParameters(10);
		System.out.println(obj1.x);
		
	}

}
