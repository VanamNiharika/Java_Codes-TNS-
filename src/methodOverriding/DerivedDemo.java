package methodOverriding;

public class DerivedDemo extends BaseDemo{
		
		public void show() {
			System.out.println("Derived instance Show() is called");
		}
		
		//Static method
		public static void print() {
			System.out.println("Derived static print() is called");
		}
}
