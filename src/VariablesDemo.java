
class VariablesDemo{
	int data = 75;  // instance variable
	static int m = 100;  //static variable
	public static void main(String[] args) {
		int n = 50;
		System.out.println(n);
		VariablesDemo a = new  VariablesDemo();
		System.out.println(a.data); //accessing instance variable
		System.out.println(VariablesDemo.m);  //accessing static method
	}
}