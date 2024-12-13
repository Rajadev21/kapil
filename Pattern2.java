/*
 * 1
 * 3 2
 * 6 5 4
 * 10 9 8 7
 * 15 14 13 12 11
 */
/*
 * in this pattern
 * no.of rows are 5 so outer loop runs 5 times
 * no.of cols will run i times 
 * but here twist is every col value start with the row(row+1)/2;
 * which is nothing but the first n natural numbers.
 */


public class Pattern2 {
    public static void main(String[] args) {
        
        for(int row = 1; row <= 5; row++){
            int num = (int)(row*(row+1))/2; // here we are finding the sum of first n(row) natural numbers.
            for(int col = 1; col <= row; col++){
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
