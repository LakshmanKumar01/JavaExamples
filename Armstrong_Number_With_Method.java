

public class Armstrong_Number_With_Method {
	static int count(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n /= 10;
			;
		}
		return c;
	}

	static int expo(int d, int n) {
		int e = 1;
		for (int i = 1; i <= count(n); i++) {
			e = e * d;
		}
		return e;
	}

	static int sum(int n) {
		int x = n;
		int s = 0;
		while (n > 0) {
			int d = n % 10;
			s = s + expo(d, x);
			n /= 10;
		}
		return s;
	}

	public static void main(String[] args) {
		int n = 153;
		if (sum(n) == n) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("not a armstrong number");

		}
	}
}
