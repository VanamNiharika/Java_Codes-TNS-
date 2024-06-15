package methodOverriding;

public class Main {

		public static void main(String[] args) {
			
			BaseDemo p1 = new DerivedDemo();
			p1.show();     //overriding instance show() of BaseDemo by printing executing DerivedDemo show()
			
			BaseDemo.print();   //Here we cannot override the static print() of BaseDemo
			BaseDemo p2 = new BaseDemo();
			p2.show();
			BaseDemo.print();

	}

}
