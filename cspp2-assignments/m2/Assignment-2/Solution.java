
/**
 * { item_description }
 */

import java.util.Scanner;
import java.lang.Math.*;
/**
 * Class for solution.
 */

class Solution {
    /*
    Do not modify this main function.
    */
    public static void rootsOfQuadraticEquation(final int a, final int b, final int  c) {
        /**
         * { item_description }
         */
        double root1, root2;
        int y = b * b - 4 * a * c;
        
             root1 = (-b + Math.sqrt(y)) / (2 * a);
             root2 = (-b - Math.sqrt(y)) / (2 * a);
            System.out.println(root1 + " " + root2);
        }
    public static void main(String[] args) {
        /**
         * { var_description }
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}

