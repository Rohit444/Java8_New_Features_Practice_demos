
public class AnonymousInnerTestWithLamdaExpression {

	public static void main(String[] args) {

		TestDemoLambdaWithLocalVariable testDemo = new TestDemoLambdaWithLocalVariable();
		testDemo.m2();
	}

}

@FunctionalInterface
interface InterfDemo{
	
	public void m1();
}

class TestDemoInnerClassWithLocalVariable {
	int x = 888; // instance variable
	
	public void m2() {
		
	InterfDemo interf = new InterfDemo() {
		
		int x = 999; // instance variable of anonymous inner class
		
		@Override
		public void m1() {
			System.out.println(this.x);
		}
	};
	
	interf.m1();
 }
// Inside anonymous inner class we can declare instance variable.
// Inside anonymous inner class "this" always refers to the current class object. So above code will always print 999
	
}

// The above code can be written using lambda expression.
class TestDemoLambdaWithLocalVariable{
	 int x = 10; // instance variable
	 
	 public void m2() {
		 
		 int y = 20; // local variable
		 
		 InterfDemo i = () ->{
			 
//			 int x = 999; // This is the local variable 
//			 System.out.println(this.x);
			 
//			  Inside lambda expression we can access both instance and local variables directly.
			 
			 System.out.println("x "+x);
			 System.out.println("y "+y);
			 
			 x = 100;
			// y = 200; // Inside a lambda expression the local variable is always final by default. we can not change its value.
			 
		 };
		 
		 i.m1();
	 }
// Inside lambda expression we can't declare instance variable, we can only declare only local variable.
// Inside lambda expression "this" always refers to outer class instance variable. So the above code will print 800
}