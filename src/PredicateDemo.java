import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[]args) {
		Predicate<Integer> p = i->i>10;
		System.out.println(p.test(100));
		
		Predicate<Integer> p1 = i-> i%2==0;
		System.out.println(p1.test(100));
		
		Predicate<String> p2 = i-> i.length() > 5;
		System.out.println(p2.test("Rohit Sharma"));
		
		// Predicate join
		
		int [] x = {0,5,10,15,20,25,30};
		Predicate<Integer> p3 = i -> i>10;
		Predicate<Integer> p4 = i -> i%2==0;
		
		System.out.println("The number is greater than 10");
		 m1(p3,x);
		System.out.println("The number is greater is even ");
		 m1(p4,x);
		System.out.println("The number is not greater than 10 "); 
		 m1(p3.negate(),x);
		System.out.println("The number is greater than 10 and even number ");
		 m1(p3.and(p4), x);
		System.out.println("The number is greater than 10 or even number ");
		 m1(p3.or(p4), x);
		 
		 // program to remove null value and empty list from a given list
		 
		 ArrayList<String> list = new ArrayList<>();
		 list.add("");
		 list.add("Rohit");
		 list.add("Swati");
		 list.add(null);
		 list.add("Sameer");
		 
		 Predicate<String> p5 = i->i != null && i.length() != 0;
		 
		 for(String l : list) {
			 if(p5.test(l)) {
				 System.out.println(l);
			 }
			 
		 }
		 
		
		
		
		
	}
	
	public static void m1(Predicate<Integer> p , int[]x) {
		for(int x1 : x){
			if(p.test(x1)){
				System.out.println(x1);
			}
		}
		
	}

}
