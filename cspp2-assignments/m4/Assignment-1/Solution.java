
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, max;
		for (i = 0; i < a.length; i++) {

			a[i] = sc.nextInt();
		}
		max = a[0];
		for (i = 0; i < a.length; i++){
			if(max < a[i]) {
				max = a[i];
			}

		}
		System.out.println(max);
		

	}
}
