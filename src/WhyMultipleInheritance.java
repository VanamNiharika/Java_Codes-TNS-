
public class WhyMultipleInheritance {
	class Parent1 {

		public void show(){

		System.out.println ( "This is parent1");
		}
	}

		class Parent2 {
			public void show() {
				System.out.println("This is parent 2"); 

			}
		}

		//class Child extends Parent1 , Parent2 { 
			// here java compilation error occurs. Since Implementing the parents g & parents classes Method 
			//overridden of method showes()
		//}
		public class MultiInheritance { 
			public static void main(String args[]) {
				//Child c = new Child();
				//c.show(); // here ambiguous / unclearness occur that which show method has to be called.

		}
	}
		
}
