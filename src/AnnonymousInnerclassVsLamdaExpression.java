
public class AnnonymousInnerclassVsLamdaExpression {

	public static void main(String[] args) {
		Test t = new Test();
		t.m2();
		
		TestLamda tl = new TestLamda();
		tl.m2();

	}

}

interface Interf{
	
	public void m1();
}

class Test{
	
	int x = 888;
	
	public void m2() {
		
	  Interf i = new Interf() {
		  
		  int x = 999; // instance variable of anonymous inner class
		@Override
		public void m1() {
			System.out.println(this.x);  // this always refer current inner class object only. output: 999
			
		}
	  };
	  i.m1();
	}
}

class TestLamda{
	
	int x = 888;
	
	public void m2() {
		Interf i = ()->{
			int x = 999; // now this is a local variable 
			System.out.println(this.x); // Inside lamda expression "this" always refer outer class instance variable only. output : 888
		};
		i.m1();
	}
	
	
}