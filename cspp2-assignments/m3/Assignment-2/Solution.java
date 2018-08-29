
/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
/*
    Do not modify this main function.
    */
/**.
 * Class for solution.
 */
public class Solution {
    /**.
     * { var_description }
     */
    private static final int SEVEN = 7;
/**.
 * { var_description }
 */
    private static final int TEN = 10;
    /**.
     * { item_description }
     */
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        /**.
         * { var_description }
         */

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        //System.out.println(n.length);

        int i;
        int count = 0; 
        int count2 = 0; 
        for(i = 1;i <= n;i++) {
            int temp = i; 
            while(temp != 0) {
                if (temp % TEN == SEVEN) {
                count = count + 1; 
            }
                temp = temp / TEN; 
            }

            }
            System.out.println(count);
            }
        }