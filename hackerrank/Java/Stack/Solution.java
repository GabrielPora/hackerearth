package Stack;

import java.util.*;

class Solution {

    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // For closing brackets, check if stack matches
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty, nothing to match — unbalanced
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check if the popped bracket matches the closing one
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // If stack is empty all brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(isBalanced(input));
        }
    }
}