/**.
 * { item_description }
 */
import java.util.*;
class Average {
	public static void main(String[] args) {
		System.out.println("Enter how many number you want to calculate average:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		double sum = 0;

		for(i=0; i<a.length; i++)
		{
			
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("The average of numbers is : " +sum/n);
	}

}