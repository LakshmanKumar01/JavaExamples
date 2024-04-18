// Lambda Expression
public interface MI {
	void m1();// abstract method
}

/*class Student implements MI{
	@Override
	public void m1() {
		System.out.println("m1 implemented");
	}
} */

 class App{
	public static void main(String[] args) {
		
		/*Student s = new Student();
		s.m1();*/
		
		MI m = ()->{ // Lambda Expression
			System.out.println("m1 implemented");
		};
		m.m1();
	}
}
