// 5.Java Program to Illustrate Handling of Checked Exception in a method
package ExceptionHandling;

import java.io.FileNotFoundException;

public class Fifth {

    public static void readFile(String filepath) throws FileNotFoundException
    {
        System.out.println(filepath);
    }
    public static void main(String[] args){
        try {
            Fifth.readFile(null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
