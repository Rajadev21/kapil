/*
 7
 14 15
 28 29 30 31
 56 57 58 59 60 61 62 63
 */
/*
 * when row = 1 col = 1  relation  2^(row - 1)
 *      row = 2 col = 2
 *      row = 3 col = 4
 *      row = 4 col = 8
 */
/*Here outer loop runs 4 times means(4 rows)
 * inner loop runs              means(2^(row-1) cols)
 */

public class Pattern1 {
    public static void main(String[] args) {
        int startingNum = 7;
        for(int row = 1; row <= 4; row++){
            int noOfCols = (int) Math.pow(2, (row - 1)); 
            int currentNum = startingNum; 
            for(int col = 1; col <= noOfCols; col++){
                System.out.print(currentNum + " ");
                currentNum++;
            }
            startingNum = startingNum * 2;
            System.out.println(); 
        }
    }
}
