
import java.util.Scanner;
public final class Solution
{/*
    Fill this main function to print maximum of given array
    */
    private Solution()
    {

    }
    public static void main(final String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, max;
        for (i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
        }
        max = a[0];
        for (i = 0; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }

        }
        System.out.println(max);


    }
}
