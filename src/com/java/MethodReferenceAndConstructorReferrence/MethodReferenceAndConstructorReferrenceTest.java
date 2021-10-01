package com.java.MethodReferenceAndConstructorReferrence;

public class MethodReferenceAndConstructorReferrenceTest {

	public static void main(String[] args) {

//		::   <- This is use for Method reference and Constructor Reference.

		// For static method m2()
		A a1 = TestClass::m2; // Method reference, We are actually reusing the code of m2 to define the
								// implementation of m1() method, Actually m1() method refers m2() internally.
		a1.m1();  // Here we are calling m1() method, But internally m2() method is executed
						// because m1() method refer m2().
		
		// For non-static method m3()
		TestClass t = new TestClass();
		A a2 = t :: m3;
		
		a2.m1();
		
	}
	
	// In order to achieve method reference it is compulsory that both method should have same argument type,
	// Method name can be different, access modifiers can be different, even return type can be different, it can be static or non static.
	// So we can say that method reference is the alternative syntax of lambda expression.

}

interface A {
	
	public void m1();
}

class TestClass{
	
	public static void m2() {
		System.out.println("Hey, Calling from m2 method .....");
	}
	
	public int m3() {
		System.out.println("Hey, Calling from m3 method .....");
		return 1;
	}
	
}