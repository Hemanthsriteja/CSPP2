import java.util.*;
class FirstLast {
	public static void main(String[] args) {
		System.out.println("Enter numbers you wish:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int i;
		for(i=0; i<a.length; i++) {

			a[i] = sc.nextInt();
		}

			if(a[0]==6 || a[n-1] == 6) {

				System.out.println("true");
			}
			else
				System.out.println("false");
		}


		}
