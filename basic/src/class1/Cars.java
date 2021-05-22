package class1;

/* Inheritence Example For Classes in Java */

class Vehicle{
	protected String company="Ford";
	public void noise() {
		System.out.println("PIIIIIppppppp");
	}
}


public class Cars extends Vehicle {
	protected String model="Mustang";
	
	public static void main(String[]args) {
		Cars obj=new Cars();
		obj.noise();
		System.out.println("Company :"+ obj.company+ "\nModel :"+ obj.model);
	}

}
