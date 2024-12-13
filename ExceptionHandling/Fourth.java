/*  4.Write a Java program to create a method that takes an
 integer as a parameter and throws an exception if the 
 number is odd. */


package ExceptionHandling;

public class Fourth {

    public static void evenOrOdd(int num) throws Exception{

       
        if(num % 2 == 0){
            System.out.println("num is even"+num);
        }else{
            throw new Exception("num is odd " + num);
        }
    }
    
    
    public static void main(String[] args) {
        try {
            evenOrOdd(5);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
    }
}
