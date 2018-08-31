
// Given an String, Write a java method that returns
// the decimal value for the given binary string.

/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public final static void main(String[] args) {
    /**.
     * { item_description }
     */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i <= n; i++){
            String s = sc.nextLine();
            int res = 0;
            if(!s.isEmpty()){
                res = binaryToDecimal(s);//Write binaryToDecimal function
                System.out.println(res);
        }
    }
    }
    /**.
     * { function_description }
     *
     * @param      res   The resource
     *
     * @return     { description_of_the_return_value }
     */

    public static int binaryToDecimal(final String res) {
        /**.
         * { var_description }
         */
        int dec = Integer.parseInt(res, 2);
        return dec;
        }
    }

