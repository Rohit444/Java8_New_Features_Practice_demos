import java.util.TreeMap;

public class SortingElementsOfTreeMapWithLamdaExpression {

	public static void main(String[] args) {
		TreeMap<Integer,String> arr = new TreeMap<>(); // for default natural sorting order according to according order of keys
		arr.put(2, "Rohit");
		arr.put(4, "Swati");
		arr.put(8, "Vivake");
		arr.put(1, "Nupur");
		System.out.println(arr);
		
		TreeMap<Integer, String> arr1 = new TreeMap<>((i1,i2)->(i1>i2)?-1:(i1<i2)? 1: 0); // for customize natural sorting order using lambda expression
		arr1.put(2, "Rohit");
		arr1.put(4, "Swati");
		arr1.put(8, "Vivake");
		arr1.put(1, "Nupur");
		System.out.println(arr1);

	}

}
