
public class TestDefaultmethodInInterface {

	public static void main(String[] args) {
		
		TestDemoDefault demo = new TestDemoDefault();
		demo.m1();

	}

}

interface Left1{
	
	default void m1() {
		
		System.out.println("Inside Left Default");
	}
}

interface Right1{
	
	default void m1() {
		
		System.out.println("Inside Right Default");
	}
}

class TestDemoDefault implements Left1, Right1{

	@Override
	public void m1() {
		Left1.super.m1();
	}

//	@Override
//	public void m1() {
//		System.out.println("Inside of the implementation of Left1 and Right1 ");
//	}
	
	
	
	
}