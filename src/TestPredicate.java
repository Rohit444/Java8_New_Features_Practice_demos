import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		int x [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		Predicate<Integer> p1 = i -> i>10;
		Predicate<Integer> p2 = i-> i%2 == 0;
		Predicate<String> p3 = Predicate.isEqual("Rohit"); // isEqual method a static method in Predicate functional interface
		
		
		TestDemoPredicate testDemo = new TestDemoPredicate();
		
		System.out.println("Numbers which are even and greater than 10 are");
		testDemo.m1(p1.and(p2), x);
		
		System.out.println(p3.test("Rohit"));
	}

}


class TestDemoPredicate{
	
	public void m1(Predicate<Integer> p, int x[]) {

		for (int x1 : x) {

			if (p.test(x1)) {
				System.out.println(x1);
			}

		}
	}
	
}