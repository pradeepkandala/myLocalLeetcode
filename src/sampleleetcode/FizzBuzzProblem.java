package sampleleetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzProblem {

	public static void main(String[] args) {
		List<String> results = fizzBuzz(10);
		for(int i=0;i<results.size();i++) {
			System.out.println(results.get(i));
		}
			

	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5 ==0)
				list.add("FizzBuzz");
			else if(i%5==0)
				list.add("Buzz");
			else if(i%3==0)
				list.add("Fizz");
			else
				list.add(String.valueOf(i));
			
		}
		return list;

	}

}
