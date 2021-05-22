package class1;

/* USe of  Java Inner Class and Outer Class*/

class OuterClass{
	int x=5;


		class InnerClass{
			int y=10;
		}
}


public class Main2 {
	
	public static void main(String[]args) {
		OuterClass myOut = new OuterClass();
		OuterClass.InnerClass myIn = myOut.new InnerClass();
		
		System.out.println(myOut.x);
		System.out.println(myIn.y);
		
	}
}
