// Given Number Is prime Or Not
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				count ++;
			}
		}
		if(count == 2) // Having two factors which is divisible by 1 & itself
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime Number");
		}
	}

}
