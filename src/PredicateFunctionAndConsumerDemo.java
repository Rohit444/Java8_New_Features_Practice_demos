import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionAndConsumerDemo {
	


	public static void main(String[] args) {
		
		Predicate<Student> p = pr -> pr.marks>60;
		
		Function<Student, String> f = fn -> {
			if(fn.marks >= 60) {
				return "A";
			}
			else if(fn.marks >= 50) {
				return "C";
			}
			else {
				return "D";
			}
		};

		Consumer<Student> c = con->{
			
			System.out.println("Student Name "+con.name);
			System.out.println("Student marks "+con.marks);
			System.out.println("Student grads "+f.apply(con));
			
		};
		
		List<Student> students = getStudentList();
	   for(Student s: students ) {
	   if(p.test(s)) {
		   c.accept(s);
	   }
	  }
	}
	
	
	
	
	
	public static List<Student> getStudentList(){
	       List<Student> student = new ArrayList<>();
	       Student s1 = new Student("Rohit", 70);
	       Student s2 = new Student("Swati", 50);
	       Student s3 = new Student("Rahul", 40);
	       student.add(s1);
	       student.add(s2);
	       student.add(s3);
	       return student;
	}
}
