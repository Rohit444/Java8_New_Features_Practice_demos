package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsPractice {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
		stream.forEach(p->System.out.println(p));
		
		
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
		
		
		List<Integer> List1 = list.stream().filter(p->p%2==0).collect(Collectors.toList());
		System.out.println(List1);
		
		Integer[] arr = list.stream().filter(p->p%2==0).toArray(Integer[]::new);
		System.out.println(arr);
		
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		
		
		memberNames.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(p->System.out.println(p));
		
		memberNames.stream().sorted().map(s->s.toUpperCase()).forEach(p->System.out.println(p));
		
		// ShortCircuit Operation
		boolean matched = memberNames.stream().anyMatch(s->s.startsWith("A"));
		System.out.println(matched);
		
		List<String> l1 = Arrays.asList("R","S",null,"O","P");
		l1.stream().filter(s->s != null).collect(Collectors.toList()).forEach(System.out::println);
		
		

	}

}
