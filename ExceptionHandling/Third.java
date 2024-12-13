// 3.Write a Java program to illustrate multiple catch 
//   block using command line argument.
package ExceptionHandling;

public class Third {
    public static void main(String[] args) {
        
          try {
            
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]); 

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two command-line arguments only.");
        } catch (NumberFormatException e) {
            System.out.println(" Please enter only valid integers as arguments.");
        } catch (ArithmeticException e) {
            System.out.println(" Division by zero is not allowed in general.");
        }
    }
}
