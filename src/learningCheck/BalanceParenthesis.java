package learningCheck;

import java.util.Stack;

public class BalanceParenthesis {

	//function to check if brackets are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> stackOfBrackets = new Stack<>();
        for(int i = 0; i<x.length(); i++)
        {
            //in case of opening brackets, will push to stack
            if(x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(')
            {
                stackOfBrackets.push(x.charAt(i));
            }
            else if(x.charAt(i) == '}')
            {
                if(stackOfBrackets.size() == 0)
                    return false;
                else if(stackOfBrackets.peek() != '{')
                    return false;
                else{
                    stackOfBrackets.pop();
                }
            }
            else if(x.charAt(i) == ']')
            {
                if(stackOfBrackets.size() == 0)
                    return false;
                else if(stackOfBrackets.peek() != '[')
                    return false;
                else{
                    stackOfBrackets.pop();
                }
            }
            else if(x.charAt(i) == ')')
            {
                if(stackOfBrackets.size() == 0)
                    return false;
                else if(stackOfBrackets.peek() != '(')
                    return false;
                else{
                    stackOfBrackets.pop();
                }
            }
        }

        //2 scenarios
        if(stackOfBrackets.size() == 0)
            return true;
        else
            return false;
    }
    
    
	static boolean isparSecond(String s) {
		Stack<Character> stk = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (stk.isEmpty()) {
				// Stack is empty, push the current bracket
				stk.push(ch);
			} else if ((stk.peek() == '(' && ch == ')') || (stk.peek() == '{' && ch == '}')
					|| (stk.peek() == '[' && ch == ']')) {
				// Found a complete pair of brackets, pop it
				stk.pop();
			} else {
				// Push current bracket onto stack
				stk.push(ch);
			}
		}

		// If stack is empty, brackets are balanced
		return stk.isEmpty();
	}
    
    public static void main(String[] args) {
	System.out.println(ispar("![()]{}{[()()]()}"));
	System.out.println(isparSecond("![()]{}{[()()]()}"));
	}
}
