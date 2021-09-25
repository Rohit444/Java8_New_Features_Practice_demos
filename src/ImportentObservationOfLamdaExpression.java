
public class ImportentObservationOfLamdaExpression {

	public static void main(String[] args) {
		
	  Test1 test = new Test1();
	  test.m2();
	  

	}

}

interface Interf1{
	public void m1();
}

class Test1{
	
	int x = 10; // Instance variable
	
	public void m2() {
		
		int y = 20;  // local variable
		
		Interf1 i = ()->{
			x = 40;
			// y = 70; // Inside lamda expression local variable is by default final or
					   // effectively final we can not change it.
			
			System.out.println(x); // from lamda expression we can access enclosing method variable(local variable)
			System.out.println(y); // and enclosing class variable (instance variable)
			
			
		};
		
		i.m1();
	}
}