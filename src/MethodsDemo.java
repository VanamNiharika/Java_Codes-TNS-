  
public class MethodsDemo {
	static String display() {
		return "display";    //static method
	}
    void display1() {
		System.out.println("display1");    //instance method
	}
	public static void main(String[] args) {
		MethodsDemo obj = new MethodsDemo(); 
		obj.display1(); //accessing instance method
		System.out.println(MethodsDemo.display());  //accessing static method

	}

}
