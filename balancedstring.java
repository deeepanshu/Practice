import java.util.*;

public class balancedstring {
    public static void main(String[] args) {
        print(String.valueOf(isValid("])")));
    }

    public static int isValid(String A) {
        HashMap<Character, Character> charmap = new HashMap<>();
        charmap.put(')', '(');
        charmap.put(']', '[');
        charmap.put('}', '{');
        Stack<Character> st = new Stack<>();

        int i = 0;
        while (i < A.length()) {
            if (A.charAt(i) == '(' || A.charAt(i) == '[' || A.charAt(i) == '{') {
                st.push(A.charAt(i));
            }
            if (A.charAt(i) == ')' || A.charAt(i) == ']' || A.charAt(i) == '}') {
                if (st.isEmpty())
                    return 0;
                if (st.peek() == (Character) charmap.get(A.charAt(i))) {
                    st.pop();
                } else {
                    return 0;
                }
            }
            i++;
        }
        if (!st.isEmpty()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }
}