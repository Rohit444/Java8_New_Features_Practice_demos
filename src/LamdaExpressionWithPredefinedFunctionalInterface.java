
public class LamdaExpressionWithPredefinedFunctionalInterface {

	public static void main(String[] args) {
		
		Runnable r = ()->{
			for(int i=0; i<=10;i++) {
				System.out.println("Inside Child thread....");
			}
		};
		
		Thread t = new Thread();
		t.start();
		System.out.println("Main Thread ....");
		
		

	}

}

//class MyThread implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0; i<=10;i++) {
//			System.out.println("Inside Child thread....");
//		}
//		
//	}
//	
//}