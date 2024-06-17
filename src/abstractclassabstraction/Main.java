package abstractclassabstraction;

public class Main {
    public static void main(String[] args) {
    	// Step 4: Instantiate Subclasses
    	   Animal myDog = new Dog();
    	   Animal myCat = new Cat();
    	   
    	   // Call the abstract method implementations
    	   myDog.makeSound(); // Outputs: Woof
    	   myCat.makeSound(); // Outputs: Meow
    	   
    	   // Call the concrete method from the abstract class
    	   myDog.eat(); // Outputs: This animal eats food.
    	   myCat.eat(); // Outputs: This animal eats food.
    }
}