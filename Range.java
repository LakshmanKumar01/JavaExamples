//Range & Factorial of that Sum
package Loops;
import java.util.Scanner;
public class Range {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range:");
		int n = sc.nextInt();
		System.out.println("Enter the Value:");
		int sum = 0;
		for(int i =1;i<=n;i++ ) {
			int a =sc.nextInt();
			sum = sum+a;
		}
		System.out.println(sum);
		System.out.println("Sum of the number is " +sum);
		int fact = 1;
		for(int j=1;j<=sum;j++) {
			fact = fact*j;
		}
		System.out.println("Factorial of the "+sum +"is "+fact);
		
		}

}
