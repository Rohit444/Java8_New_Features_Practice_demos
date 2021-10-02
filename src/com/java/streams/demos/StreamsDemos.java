package com.java.streams.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemos {

	public static void main(String[] args) {

	List<Integer> l = new ArrayList<>();
	l.add(0);
	l.add(10);
	l.add(20);
	l.add(5);
	l.add(15);
	l.add(25);
	
	List<Integer> l1 = l.stream().filter(i-> i%2==0).collect(Collectors.toList());
	System.out.println(l1);
	
	List<Integer> l2 = l.stream().map(i-> i * 2).collect(Collectors.toList());
	System.out.println(l2);
	
	// Sort the elements in the above list
	List<Integer> l3 = l.stream().sorted().collect(Collectors.toList());
	System.out.println(l3);
	Integer min = l3.stream().min((i1,i2)-> i1.compareTo(i2)).get();
	System.out.println("Minimum value "+min);
	Integer max = l3.stream().max((i1,i2)-> i1.compareTo(i2)).get();
	System.out.println("Maximum value "+max);
	
	// Customize sorting reverse of natural sorting order
	List<Integer> l4 = l.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
	System.out.println(l4);
	
	List<String> listName = new ArrayList<>();
	listName.add("Rohit");
	listName.add("Sameer");
	listName.add("Nikita");
	listName.add("Mrinal");
	listName.add("Animesh");
	listName.add("Swati");
	
	// Extract a separate List of names having number of letter grater than 5
	List<String> names = listName.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
	System.out.println(names);
	
	// Extract a separate List of names with Upper case 
	List<String> names1 = listName.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	  System.out.println(names1);
	  
	// Count the number of names having number of letter grater than 5 in the above list
    Long count = listName.stream().filter(s-> s.length()>5).count();
      System.out.println(count);
      
   // Print each names from the above list using forEach in streams
  	listName.stream().forEach(s -> System.out.println(s));
  	
   // Or we can also do the same thing using method reference
  	listName.stream().forEach(System.out :: println);
  	
   // using Stream.of for non collections (group of values or Arrays)
  	Stream<Integer> s = Stream.of(9,99,999,99999,999999);
  	s.forEach(System.out :: println);
  	
  	Double[] d = {1.1, 1.2, 1.4, 2.2, 10.4};
  	Stream<Double> str = Stream.of(d);
  	str.forEach(System.out :: println);
  System.out.println("============================================================================");
  // Given a list of integers, find out all the numbers starting with 1 using Stream functions
  	
  	List<Integer> myList = Arrays.asList(10,15,12,25,40,80);
  	myList.stream().map(st-> st +"").filter(i -> i.startsWith("1")).forEach(System.out :: println);
  	
  	System.out.println("============================================================================");
  	
 // How to find duplicate elements in a given integers list in java using Stream functions?
  	List<Integer> myList1 = Arrays.asList(10,15,12,25,40,80,40, 12);
  	Set<Integer> set = new HashSet<Integer>();
  	myList1.stream().filter(i -> !set.add(i)).forEach(System.out :: println);
  	
  	System.out.println("============================================================================");
  	
 // Given the list of integers, find the first element of the list using Stream functions?
  	List<Integer> myList2 = Arrays.asList(10,15,12,25,40,80,40, 12);
  	myList2.stream().findFirst().ifPresent(System.out :: println);
  	
  	System.out.println("============================================================================");
 // Given a list of employees, you need to filter all the employee whose age is greater than 20 and print the employee names.
  	List<Employee> employeeList = createEmployeeList();
  	employeeList.stream().filter(f-> f.age >20).forEach(System.out :: println);
  	
  	System.out.println("============================================================================");
  	
 // Given the list of employees, find the employee with name “Mary”.
  	employeeList.stream().filter(e -> e.name.equalsIgnoreCase("Mary")).forEach(System.out :: println);
  	System.out.println("============================================================================");
 // Given a list of employee, find maximum age of employee?
  	Employee e = employeeList.stream().max((e1,e2)-> e1.age.compareTo(e2.age)).get();
  	System.out.println(e);
  	
  	System.out.println("====================Second largest number from an arrayList-I========================================================");
    // Second largest number from an arrayList
  	List<Integer> integers = Arrays.asList(1,2,10,4,5,6,3,8,9,24);
  	Integer largestInteger = integers.stream().max((x1,x2)-> x1.compareTo(x2)).get();
  	System.out.println("Largest Integer "+largestInteger);
  	Integer secondLargestInteger = integers.stream().filter(x -> x < largestInteger).max((x1,x2)-> x1.compareTo(x2)).get();
	System.out.println("Second Largest Integer "+secondLargestInteger);
	
	System.out.println("====================Second largest number from an arrayList - II========================================================");
	
	Optional<Integer> secondLargestInt = integers.stream().sorted((x1,x2)-> -x1.compareTo(x2)).limit(2).skip(1).findFirst();
	System.out.println(secondLargestInt);
	
	System.out.println("====================Second largest number from an arrayList - III========================================================");
    List<Integer>  newList1 = integers.stream().sorted().collect(Collectors.toList());
	int j = Collections.max(newList1);
    newList1.remove(newList1.indexOf(j));
    int i = Collections.max(newList1);
    System.out.println(i);
    
    
    
}
	
	
	 public static List<Employee> createEmployeeList()
	    {
	        List<Employee> employeeList=new ArrayList<>();
	 
	        Employee e1=new Employee("John",21);
	        Employee e2=new Employee("Martin",19);
	        Employee e3=new Employee("Mary",31);
	        Employee e4=new Employee("Stephan",18);
	        Employee e5=new Employee("Gary",26);
	 
	        employeeList.add(e1);
	        employeeList.add(e2);
	        employeeList.add(e3);
	        employeeList.add(e4);
	        employeeList.add(e5);
	 
	        return employeeList;
	    }
	
	

}
