package functionalinterface;

public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  //implementation of one and only abstract method
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
}
