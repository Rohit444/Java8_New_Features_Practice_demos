package com.java.differenceBetweenMapAndFlateMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferenceBetweenMapAndFlateMap {

	public static void main(String[] args) {
		EmployeesDetails employeeDetails = new EmployeesDetails();
		List<Employee> employeesList = employeeDetails.getAll();

		// employee.getEmail -> One to One mapping (between employee and email) so we are using map()
		List<String> emails = employeesList.stream().map(employee -> employee.getEmail()).collect(Collectors.toList());
		System.out.println(emails);

		// This is not a good approach if we have one to Many mapping (Like here between Employee and phone number)
		// Avoid using map() here.
		List<List<Integer>> phoneNumbers = employeesList.stream().map(employee -> employee.getPhoneNumber())
				.collect(Collectors.toList());
		System.out.println(phoneNumbers);

		// employee.getPhoneNumber().stream() -> One to Many mapping so we are using
		// flatMap(), Note that we are providing stream() of phone numbers here as input for flatMap()
		List<Integer> phone = employeesList.stream().flatMap(employee -> employee.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println(phone);
		
		
		// Combining two list into one single list using flatMap()
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
         
        List<String> combinedList = Stream.of(listOne, listTwo)
                                        .flatMap(x -> x.stream())
                                        .collect(Collectors.toList());
        System.out.println(combinedList);
		
	}

}
