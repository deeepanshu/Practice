import java.util.*;

public class NearestSmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(34);
        A.add(35);
        A.add(27);
        A.add(42);
        A.add(5);
        A.add(28);
        A.add(39);
        A.add(20);
        A.add(28);
        // A.add(10);
        // A.add(8);

        for (int i : prevSmaller(A)) {
            System.out.println(i);
        }
    }

    static public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 0;
        while (i < A.size()) {
            int n = 0;
            while (n < i) {
                st.push(A.get(n));
                n++;
            }
            if (st.empty()) {
                l.add(-1);
                i++;
                continue;
            }
            int flag = -1;
            int small = Integer.MAX_VALUE;
            while (!st.empty()) {
                int popped = st.pop();
                if (popped < A.get(i)) {
                    small = min(small, popped);
                    flag = 1;
                    break;
                }
            }
            l.add(flag == -1 ? -1 : small);
            i++;
        }
        return l;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }
}