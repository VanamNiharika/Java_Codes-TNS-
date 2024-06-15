package parameterizedconstructor;

public class Pcons {
	private String name;
	private int id;
	private String gender; 
	
	public Pcons(String name,int id,String gender) {
		
		this.name = name ;

		this.id = id;

		this.gender = gender;

	}
	
	public void details() { 
		System.out.println ("name:"+ name + "    id:"+ id +"   gender:"    + gender );
	}

}
