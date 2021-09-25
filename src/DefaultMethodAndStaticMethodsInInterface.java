
public class DefaultMethodAndStaticMethodsInInterface {

	public static void main(String[] args) {
		
		Test4 t = new Test4();
		t.m2();
		

	}

}

interface Interf4 {
	 
	public void m1();
	
	 default void m2() {
		 System.out.println("Inside default method ");
	 }
	
}

class Test4 implements Interf4{

	@Override
	public void m1() {
		
		System.out.println("Inside m1 impl");
		
	}
	@Override
	public void m2() {
		System.out.println("Overriden form of m2 ");  // we can override default method of interface
	}
	
}