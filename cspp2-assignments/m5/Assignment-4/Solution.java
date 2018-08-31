// Given an String, Write a java method that returns the decimal
// value for the given binary string.

/**.
 * { item_description }
 */

import java.util.Scanner;
/**.
 * Class for solution.
 */

public class Solution {
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
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static String reverseString(final String s) {
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        return reverse;
    }

}
