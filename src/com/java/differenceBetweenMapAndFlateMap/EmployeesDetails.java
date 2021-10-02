package com.java.differenceBetweenMapAndFlateMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeesDetails {
	
	public List<Employee> getAll(){
	
		List<Employee> employees = Stream.of(
				 new Employee("Rohit", "Rohit@Gmail.com", Arrays.asList(2367645, 7764536)),
				 new Employee("Swati", "Swati@Gmail.com", Arrays.asList(673543, 783745, 367465)),
				 new Employee("Sameer", "Sameer@Gmail.com", Arrays.asList(5652453, 67465,435645)),
				 new Employee("Nupur", "Nupur@Gmail.com", Arrays.asList(767465, 675645329, 6764563,676534))
				 ).collect(Collectors.toList());
		
		return employees;
	}

}
