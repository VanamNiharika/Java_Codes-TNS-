package defaultconstructor;

public class Dcons{
	
	private String name;
	private int id;
	private String gender; 
	
	public Dcons() {
		
		this.name = "niha";

		id=38;

		gender = "female";

	}
	
	public void details() { 
		System.out.println ("name:"+ name + "    id:"+ id +"   gender:"    + gender );
	}
}





