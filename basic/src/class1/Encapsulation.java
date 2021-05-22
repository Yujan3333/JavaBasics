package class1;

public class Encapsulation {
	private String myName ="Yujan";
	
	public String getname()
	{
		return myName;
	}
	
	public void setName( String name) {
		this.myName= name;
	}

}

class Main1{
	public static void main(String[]args) {
		Encapsulation obj=new Encapsulation();
		obj.setName("Basnet");
		System.out.println(obj.getname());
	}
	
}
