import java.util.*;

public class PostStack {
    static int evalPostfix(char[] postfix) {
        // create a new stack
        Stack<Integer> st = new Stack<>();
        int val;

        // iterate over each character in user char array
        for (char ch : postfix) {
            // if character is digit, push to stack
            if (Character.isDigit(ch))
                //
                st.push(ch - '0');
            // else if character is an operator '+','*','-','/'
            else {
                // pop the last two values to perform the calculation
                int value1 = st.pop();
                int value2 = st.pop();
                // perform the calculation and check
                val = calculate(value1, value2, ch);
                st.push(val);
            }
        }
        return st.pop();
    }

    private static int calculate (int value1, int value2, char ch) {
        int val = 0;
        if (ch == '+') {
            val = value2 + value1;
        } else if (ch == '-') {
            val = value2 - value1;
        } else if (ch == '*') {
            val = value2 * value1;
        } else if (ch == '/') {
            val = value2 / value1;
        }
        return val;
    }

    public static void main(String[] args) {
        char[] postfix = {'3','2','1','*','+','9','2','+','+'};
        System.out.println("Postfix answer for expression '" + String.valueOf(postfix) + "':\n" + evalPostfix(postfix));
    }
} 