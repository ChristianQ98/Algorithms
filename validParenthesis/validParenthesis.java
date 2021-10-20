package validParenthesis;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // Return false if there are not an even amount of letters in the string
        if(s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()) {
            switch(c) {
                // Add the opening parenthesis to the stack if it is in the string
                case '(': 
                    stack.push(c);
                    break;
                // Add the opening curly bracket to the stack if it is in the string
                case '{':
                    stack.push(c);
                    break;
                // Add the opening bracket to the stack if it is in the string
                case '[': 
                    stack.push(c);
                    break;
                // If there is a closing parenthesis & the stack is not empty & at the top of the stack is an opening parenthesis, 
                // then remove the opening parenthesis from the stack
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    // Return false if the stack is empty or the top of the stack is not an opening parenthesis
                    return false;
                // If there is a closing curly bracket & the stack is not empty & at the top of the stack is an opening curly bracket, 
                // then remove the opening curly bracket from the stack
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        break;
                    }
                    // Return false if the stack is empty or the top of the stack is not an opening parenthesis
                    return false;
                // If there is a closing bracket & the stack is not empty & at the top of the stack is an opening bracket, 
                // then remove the opening bracket from the stack
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        break;
                    }
                    // Return false if the stack is empty or the top of the stack is not an opening parenthesis
                    return false;
                // Return false if none of the above conditions are met
                default:
                return false;
            }
        }
        // If the stack is empty, then return true because then all parenthesis & brackets were opened & closed in order
        // If the stack is not empty, then return false because then either the parenthesis were not closed in order or there were an uneven amount
        return stack.isEmpty();
    }
}
