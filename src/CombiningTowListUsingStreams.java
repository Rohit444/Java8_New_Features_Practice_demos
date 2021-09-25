import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombiningTowListUsingStreams {

	public static void main(String[] args) {
		
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
         
        List<String> combinedList = Stream.of(listOne, listTwo)
                                        .flatMap(x -> x.stream())
                                        .collect(Collectors.toList());
        System.out.println(combinedList);
        
        
        ArrayList<Integer> listOne1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        
        // Even numbers from aList of integers
        List<Integer> l = listOne1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l);
        
        // Converting List of String into List of Integer using map() and stream
        List<String> list = Arrays.asList( "-1" , "2", "3", "4", "5" );
        
        List<Integer> newList = list.stream().map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        System.out.println(newList);
        
        // Finding the 2nd largest number from a List of integer
        List<Integer> list2 = Arrays.asList(1,2,4,7,8,3);
        
        List<Integer> newList1 = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(newList1);
         int j = Collections.max(newList1);
         newList1.remove(newList1.indexOf(j));
         int i = Collections.max(newList1);
         
         System.out.println(i);
         

	}

}
