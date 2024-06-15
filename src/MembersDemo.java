
public class MembersDemo {
    	int a = 10;              //instance variable
        static int b=20;         //static variable
        int display() {

			return 30;
        }
        
        static int display1() {
			return 40;
        }
		public static void main(String[] args) {
			MembersDemo a = new MembersDemo();
			System.out.println(a.a);            //accessing instance variable
			System.out.println(a.display());    //accessing instance method
			System.out.println(MembersDemo.b);              //accessing static variable
			System.out.println(MembersDemo.display1());     //accessing static method
		}	

}
