import java.util.*;

public class ExpressionSolver {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>();
        A.add("4");
        A.add("2");
        A.add("*");

        System.out.println(expressionSolver(A));
    }

    static public int expressionSolver(ArrayList<String> A) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < A.size()) {
            if (A.get(i).equals("+") || A.get(i).equals("-") || A.get(i).equals("*") || A.get(i).equals("/")) {
                int a = st.pop();
                int b = st.pop();
                if (A.get(i).equals("+")) {
                    st.push(a + b);
                }
                if (A.get(i).equals("-")) {
                    st.push(b - a);
                }
                if (A.get(i).equals("/")) {
                    st.push(b / a);
                }
                if (A.get(i).equals("*")) {
                    st.push(a * b);
                }
            } else {
                int n = Integer.parseInt(A.get(i));
                st.push(n);
            }
            i++;
        }
        return st.pop();
    }
}