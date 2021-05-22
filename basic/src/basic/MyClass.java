package basic;

//For Multiple class and Multiple Objects Practice


class Second {
	int x=5;
}


class MyClass{
	public static void main(String[]args) {
		Second obj1= new Second();
		Second obj2= new Second();
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		
	}
}
