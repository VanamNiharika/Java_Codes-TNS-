public class TryCatchExample{  
  
    public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        System.out.println(data);
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}