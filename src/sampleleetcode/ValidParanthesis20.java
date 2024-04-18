package sampleleetcode;

import java.util.Stack;

public class ValidParanthesis20 {

	public static void main(String[] args) {

		System.out.println(isValid("()"));

	}

	public static boolean isValid(String s) {

		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		
		char[] arr = s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='(')
				stack.push(')');
			else if(arr[i]=='{')
				stack.push('}');
			else if(arr[i] == ('['))
				stack.push(']');
			else if(arr[i] == ')')
				if(stack.isEmpty())
					return false;
				else if (arr[i]!=(Character) stack.peek())
					return false;
				else 
					stack.pop();
			else if(arr[i] == '}')
				if(stack.isEmpty())
					return false;
				else if (arr[i]!=(Character) stack.peek())
					return false;
				else 
					stack.pop();
			else if(arr[i] == ']')
				if(stack.isEmpty())
					return false;
				else if (arr[i]!=(Character) stack.peek())
					return false;
				else 
					stack.pop();
				   
		}

		if(stack.isEmpty())
			return true;
		
		
		return false;
	}

}
