// 1.Write a Java program to use the try and catch and finally block.
package ExceptionHandling;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {

        System.out.println("Connection established");
        
        try{

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        int c = a/b;
        System.out.println("division of a and b is a/b =  "+ c);
        }catch(Exception e){
            System.out.println("Exception occured");
        }

        finally{
        System.out.println("Connection is closed");
        }
    }
}
