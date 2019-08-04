import java.util.*;

public class RedundantBrace {
    public static void main(String[] args) {
        System.out.println(isRedundant("((a+c))"));
    }

    public static int isRedundant(String A) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < A.length()) {
            if (A.charAt(i) == '-' || A.charAt(i) == '+' || A.charAt(i) == '*' || A.charAt(i) == '/'
                    || A.charAt(i) == '(') {
                st.push(A.charAt(i));
            }
            if (A.charAt(i) == ')') {
                if (st.peek() == '(')
                    return 1;
                else {
                    while (st.peek() != '(')
                        st.pop();
                    st.pop();
                }
            }
            i++;
        }
        return 0;
    }
}