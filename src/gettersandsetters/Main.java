package gettersandsetters;

public class Main {
	 // Main method to test the getters and setters
    public static void main(String[] args) {
    	
        // Create a new Person object
        PersonInfo person = new PersonInfo();

        // Set values using setters
        person.setName("John Doe");
        person.setAge(25);
        person.setId(01);

        // Print initial values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Id: " + person.getId());

        // Use setters to change the values
        person.setName("Jane Smith");
        person.setAge(30);
        person.setId(02);

        // Print updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Id: " + person.getId());

        // Try setting an invalid age
        person.setAge(-5);
    }
    

}