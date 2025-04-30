package programming_class;

import java.util.Scanner;

public class Fibonacci_series {
	public static void main(String[] args) {
		System.out.println("enter the ending number in the series:");
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		sc.close();
		int a = 0;
		int b = 1; 
		int c = 0;
		for(int i=1;c<=end;i++) 
		{
			System.out.println("the numbers in the series" + c + ";");
			a = b;
			b = c;
			c = a + b;
		}

		System.out.println();

	}
}
