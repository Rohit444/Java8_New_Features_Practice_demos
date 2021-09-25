import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingOurOwnClassByUsingLamdaExpression {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(102, "Rohit"));
		list.add(new Employee(104, "Suman"));
		list.add(new Employee(108, "Kabir"));
		list.add(new Employee(101, "Nupur"));

		System.out.println(list);
		System.out.println("After Sorting");
		// here we are using lamda expression in place of Comparator functional interface as a 2nd parameter of sort() method
		Collections.sort(list, (e1, e2) -> (e1.employeeNumber > e2.employeeNumber) ? -1
				: (e1.employeeNumber < e2.employeeNumber) ? 1 : 0);
		System.out.println(list);
	}

}
