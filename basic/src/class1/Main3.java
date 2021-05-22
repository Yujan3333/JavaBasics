package class1;


/* Static Inner Class in Java */


class OutClass {
	  int x = 10;

	  static class InnerClass {
	    int y = 5;
	  }
	}

	public class Main3 {
	  public static void main(String[] args) {
	    OutClass.InnerClass myInner = new OutClass.InnerClass();
	    System.out.println(myInner.y);
	  }
	}




