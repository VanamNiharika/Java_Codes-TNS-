package abstractioninterface;

public class Main {
	public static void main(String[] args) {
		 Animal dog = new Dog();
		 dog.makeSound(); // Outputs: Bark
		 dog.eat();       // Outputs: Dog is eating

		 Animal cat = new Cat();
		 cat.makeSound(); // Outputs: Meow
		 cat.eat();       // Outputs: Cat is eating
	}
}

