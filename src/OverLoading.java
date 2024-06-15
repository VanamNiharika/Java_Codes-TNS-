
public class OverLoading {
		public  void haii() {
			System.out.println("haii() is called");  // same method with no parameter
		}
		public  void haii(String a) {
			System.out.println("haii() "+ a + " is called");    //same method with parameter
		}
		public static void main(String args[])
		{
			OverLoading t = new OverLoading();
			t.haii();       //calling instance method without parameter
			t.haii("Niharika");    //calling instance method without parameter
		}

	}


