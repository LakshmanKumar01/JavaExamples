
public class Swapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		System.out.println("Before Swapping");
		System.out.println("A value is " +a);
		System.out.println("B value is " +b);

	 a = a+b;      // int c = a
		b = a-b;      //    a = b
		a = a-b;      //    b = c	
		System.out.println("After Swapping");
		System.out.println("A value is " +a);
		System.out.println("B value is " +b);
	}

}
