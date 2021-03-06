import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :
 */
class Set {
/**.
 * { var_description }
 */
    private int[] set;
    /**.
     * { var_description }
     */
    private int size;
    /**.
     * { var_description }
     */
    private static final int T_Y = 20;
    /**.
     * { item_description }
     */



/**.
 * Constructs the object.
 */
    Set() {
    /**.
     * { item_description }
     */
        set = new int[T_Y];
        size = 0;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        set[ size++ ] = item;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "{";
        for (int  i = 0; i < size - 1; i++) {
            str = str + set[i] + ",";
        }
        str = str + set[size - 1] + "}";
        return str;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        for (int element : set) {
            if (element == item) {
                return true;
            }
        }
        return false;
    }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int intersection(final Set s) {
        return 0;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public static int retainAll(final int[] item) {
        return 0;
    }
    // public int[][] cartesianProduct(final Set s) {
    //     return ;
    // }
    /**.
     * { add function }
     *
     * @param      item  The item
     */
    public void add(final int[] item) {
        int len = item.length + size;
        int temp = 0;
        for (int i = size; i < len; i++) {
            set[i] = item[temp];
            temp++;
        }
        size = len;


    }

/**
 * Solution class for code-eval.
 */
public static final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static  int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                // case "cartesianProduct":
                // s = new Set();
                // t = new Set();
                // intArray = intArray(tokens[1]);
                // s.add(intArray);
                // intArray = intArray(tokens[2]);
                // t.add(intArray);
        // System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                // break;
                default:
                break;
            }
        }
    }
}
}




