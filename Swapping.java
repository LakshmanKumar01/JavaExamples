package hello;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 30;
		System.out.println("Before Swapping");
		System.out.println("A value is " +a);
		System.out.println("B value is " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println("A value is " +a);
		System.out.println("B value is " +b);
	}

}
