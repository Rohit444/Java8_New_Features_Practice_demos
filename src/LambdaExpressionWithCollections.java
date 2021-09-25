import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressionWithCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(0);
		arr.add(20);
		arr.add(14);
		arr.add(5);
		
		System.out.println("Before Sorting "+arr);
		Collections.sort(arr);
		System.out.println("Before Customize Sorting "+arr);
		Collections.sort(arr, (i1,i2)->(i1 >i2) ? -1 : (i1<i2) ? +1:0);  //using lambda expression for customize sorting order
		System.out.println("After Customize Sorting "+arr);
		Collections.sort(arr);
		

	}

}

//class MyComparator implements Comparator<Integer>{
//	@Override
//	public int compare(Integer obj1, Integer obj2) {
//		if(obj1 > obj2) {
//			return -1;
//		}
//		if(obj1 < obj2) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
//	
//}