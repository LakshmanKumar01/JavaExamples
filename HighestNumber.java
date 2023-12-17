// Highest Number of Three Numbers
import java.util.Scanner;
public class HighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		System.out.println("Enter c value");
		int c = sc.nextInt();
		int high = (a > b && a > c)?a:(b > c)?b : c;
		System.out.println("Highest Number is " + high);
	}

}
