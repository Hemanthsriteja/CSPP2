import java.util.*;
class SumOfNNumbers{
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		// using for loop//
		// int n = sc.nextInt();
		// int sum = 0;
		// int i = 0;

		// for(i=0;i<=n;i++){
		// 	sum = sum+i;
		// }
		// 
		//System.out.println("Sum of number is: "+ sum);
		


		//using while loop 
		
		int n = sc.nextInt();
		int sum = 0;
		int i= 1;
		while(i<=n){
		sum = sum +i;
		i++;
		}
		System.out.println(sum);
	}

}
