package class1;

abstract class Main{
	public String fname = "Yujan";
	public int age = 23;
	public abstract void study();
	}

class Student extends Main {
	public int yearOfGraduation = 2021;
	public void study()
	{
		System.out.println("I AM HERE!!");
	}
	
}

class Second{
	public static void main(String[]args) {
		Student obj=new Student();
		
		obj.study();
		System.out.println("AGE IS :" + obj.age);
		System.out.println("Name ="+ obj.fname);
		System.out.println("Year=" + obj.yearOfGraduation);
		
	}
}