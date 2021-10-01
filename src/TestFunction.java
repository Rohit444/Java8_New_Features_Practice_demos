import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunction {

	public static void main(String[] args) {
		// Write a function which returns length of a String 
		
//		Function<String, Integer> f1 = s -> s.length();
//		
//		String s1 = "Rohit Sharma";
//		System.out.println("Length is "+f1.apply(s1));
//		
//		Function<String, String> f2 = s -> s.toUpperCase();
//		Function<String, String> f3 = s -> s.substring(0, 9);
//		
//		System.out.println("Final String "+f2.andThen(f3).apply("Rohit Sharma"));
//		System.out.println("Final String "+f3.andThen(f2).apply("Rohit Sharma"));
//		
//		System.out.println("Final String "+f2.compose(f3).apply("Rohit Sharma"));
//		
//====================================================================================================================================================
		
		List<Student> studnets = new ArrayList<>();
		
		Student s2 = new Student("Rohit", 80);
		Student s3 = new Student("Swati", 70);
		Student s4 = new Student("Sameer", 60);
		Student s5 = new Student("Mohit", 50);
		
		studnets.add(s2);
		studnets.add(s3);
		studnets.add(s4);
		studnets.add(s5);
		
	
		Predicate<Student> p1 = s -> s.marks > 60;
		
		
		Function<Student, String> f4 = s -> {
			
			if(s.marks > 70) {
				return "A";
			}
			else if(s.marks >60) {
				return "B";
			}
			else if(s.marks >50) {
				return "C";
			}
			else {
			return "Fail";
			}
		};
		
	Consumer<Student> c = std -> System.out.println(std);
	
	Display(p1, f4, c, studnets );

}
	
	public static void Display(Predicate<Student> s, Function<Student, String> f, Consumer<Student> c,
			List<Student> studnets) {
		
		for(Student student : studnets) {
			System.out.println("Student Grad "+f.apply(student));
			System.out.println("Student Info ");
			c.accept(student);
			System.out.println("====================================");
		}

	}
	

}
