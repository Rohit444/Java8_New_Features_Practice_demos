
public class StaticMethodInsideAnInterface implements Interf5 {

	public static void main(String[] args) {
		
		StaticMethodInsideAnInterface staticMethodInsideAnInterface = new StaticMethodInsideAnInterface();
		//staticMethodInsideAnInterface.m1(); // calling static method of interface by using implemented class object but invalid
		//StaticMethodInsideAnInterface.m1(); // calling static method of interface by using implemented class name but invalid
		Interf5.m1();  // calling static method of interface just by using Interface name this is valid.

	}

}

interface Interf5{
	
	public static void m1() {
		System.out.println("In side static method of an interface ");
	}
	
	
}
