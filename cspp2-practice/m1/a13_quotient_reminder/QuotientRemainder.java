import java.util.*;
class QuotientRemainder
{
	public static void main(String[] args) {
		System.out.println("Enter two numbers dividend and divisor:");
		int a,b, quotient, reminder;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b= sc.nextInt();
		quotient = a/b;
		reminder = a%b;
		System.out.println("Quotient is:"+ quotient);
		System.out.println("Remainder is:" + reminder);

	}
}