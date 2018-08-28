import java.util.Scanner;
import java.lang.Math.*;


public class Solution {
    /*
    Do not modify this main function.
    */
    public static void rootsOfQuadraticEquation(int a, int b,int  c){
        double root1, root2;
        int y = b*b - 4*a*c;
        if(y>0){
             root1 = (-b + Math.sqrt(y))/(2*a);
             root2 = (-b - Math.sqrt(y))/(2*a);
            System.out.println(root1+" "+root2);
        }
        else if(y==0){
             root1 = -b/(2*a);
             root2 = -b/(2*a);
            System.out.println(root1+" "+root2);
            
        }
        else{
             root1 = -b/(2*a);
             root2 = Math.sqrt(-y)/(2*a);
            System.out.println(root1+" "+root2);
            }
        }

    public static void main(String[] args)
     {
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
