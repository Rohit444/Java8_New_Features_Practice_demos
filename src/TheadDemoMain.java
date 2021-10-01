
public class TheadDemoMain {
	
	// public static MyRunnable runnable = new MyRunnable();

	public static void main(String[] args) {
		// Using Lambda expression
//		  Runnable r = () -> {
//			for(int i =0; i<10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
		
		//Using Lambda expression and Anonymous inner class
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				for(int i =0; i<10; i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		};
		
		// The above code can also be written using lambda expression as 
//		Runnable r = ()->{
//			for(int i =0; i<10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
		
		// We can directly pass lambda expression as an argument to the thread constructor
		
		Thread th = new Thread(()->{
			for(int i =0; i<10; i++) {
				System.out.println("Child Thread");
			}
		});
		th.start();
		
		for(int i=0; i<10; i++) {
			System.out.println("Main thread");
		}
// ** Important note : Every Anonymous inner class can not be replaced with the lambda expression.
	                 // If an Interface is a functional interface (it contains only one public abstract method) can be replaced with lambda expression
		

	}

}
