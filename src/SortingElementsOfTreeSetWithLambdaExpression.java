import java.util.TreeSet;

public class SortingElementsOfTreeSetWithLambdaExpression {

	public static void main(String[] args) {
		TreeSet<Integer> arr = new TreeSet<Integer>(); 
		// If we want default natural sorting order then we use TreeSet.
		arr.add(10);
		arr.add(0);
		arr.add(20);
		arr.add(14);
		arr.add(5);
		System.out.println(arr);
		
		// Now if you want customize sorting order then we should use should pass comparator object as shown below
		TreeSet<Integer> arr1 = new TreeSet<Integer>((i1,i2)->(i1>i2)? -1:(i1<i2)? 1:0); 
		arr1.add(10);
		arr1.add(0);
		arr1.add(20);
		arr1.add(14);
		arr1.add(5);
		System.out.println(arr1);

	}

}
