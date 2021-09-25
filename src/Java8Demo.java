
public class Java8Demo {

	public static void main(String[] args) {
		
		Interf i = (a,b) -> System.out.println(a+b);
		Interf1 i1 = l -> System.out.println(l.length());
		Interf2 i2 = n -> n * n;
		i1.getLength("Rohit");
		i.sayHellow(4,4);
		System.out.println(i2.squareIt(4));

	}

	
	@FunctionalInterface
	interface Interf{
		public void sayHellow(int a, int b);
	}
	
	@FunctionalInterface
	interface Interf1{
		public void getLength(String l);
	}
	
	@FunctionalInterface
	interface Interf2{
		public int squareIt(int l);
	}
	
	


}
