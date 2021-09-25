
public class DefaultMethodWithRespectToMultipleInheritance {

	public static void main(String[] args) {
		
		Test5 test = new Test5();
		test.m1();
		

	}

}

interface Left{
	default void m1() {
		System.out.println("Inside Left default method...");
	}
}

interface Right {
	default void m1() {
		System.out.println("Inside Right default method...");
	}
}

class Test5 implements Left, Right{

	@Override
	public void m1() {
		Left.super.m1(); // calling default method of Left interface
		Right.super.m1(); // calling default method of Right Interface
		System.out.println("My own version of m1 method ....."); // we can have our own version
	}
	
}