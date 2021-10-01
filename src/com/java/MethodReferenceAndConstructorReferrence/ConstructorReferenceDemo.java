package com.java.MethodReferenceAndConstructorReferrence;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		
//		Interf i = ()-> {
//			Sample s = new Sample();
//			return s;
//		};
//
//		i.get();
		
		Interf i = Sample::new; // Internally get() method of Interf functional interface is referring to Sample
								// class no argument constructor
		Sample s = i.get();
	}
	

}

interface Interf {
	
	public Sample get();
}

class Sample{
	
	Sample(){
		
		System.out.println("Sample constructor executed & Object Creation");
	}
}