package com.java.MethodReferenceAndConstructorReferrence;

public class MultiThreadExampleUsingLambdaExpressionAndMethodReference {
	
        public static void main(String[] args) {
        	
        	TestDemo t1 = new TestDemo();
        	
        	Runnable r = t1 :: m2; //Using Method reference for non-static method we are defining Runnable functional interface run() method 
        							//by referring to already present m2 method in TestDemo class.
        							// Best example for reusing the code.
        	
        	Thread t = new Thread(r);
        	t.start();
        	for(int i=0; i<10; i++) {
        		System.out.println("Main Thread");
        	}
        	
        }
}

class TestDemo{
	
	public static void m1() {
		for(int i=0; i<10; i++) {
    		System.out.println("Child Thread");
    		}
	}
	
	public  void m2() {
		for(int i=0; i<10; i++) {
    		System.out.println("Child Thread");
    		}
	}
	
}