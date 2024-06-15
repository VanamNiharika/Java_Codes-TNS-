package hierarchicalinheritance;

public class Main {

	public static void main(String[] args) {
		Plants obj1 = new Plants();
		Animals obj2 = new Animals();
		obj1.ecosystem();
		obj1.eaten();
		obj2.ecosystem();
		obj2.eats();

	}

}
