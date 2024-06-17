package abstractclassabstraction;

//Step 1: Define an Abstract Class
abstract class Animal {
 // Step 2: Declare Abstract Methods
 abstract void makeSound();
 
 // Concrete method
 void eat() {
     System.out.println("This animal eats food.");
 }
}