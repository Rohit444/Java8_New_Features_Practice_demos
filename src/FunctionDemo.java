import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// Program to remove Spaces present in a given String using Function
		
		String str = "Rohit Sharma";
		
		Function<String, String> f = s -> s.replaceAll(" ", "");
		
		System.out.println(f.apply(str));
		
		
		//Count no. of Spaces in a String
		
		String str2 = "Rohit Sharma TelusInternational";
		Function<String, Integer> f1 = s-> s.length() - s.replaceAll(" ", "").length();
		System.out.println(f.apply(str2));

	}

}
