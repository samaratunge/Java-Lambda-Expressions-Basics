package variable;

import java.util.Arrays;
import java.util.List;

public class VariableCapture {
	
	private static int var = 10;


	public static void main(String[] args) {
	   
		List<Integer> intSeq = Arrays.asList(10,20,30,40,50);
		//
		intSeq.forEach(x -> System.out.println(x + var));
	
	}
}
