import java.util.*;

public class NearestSmallerElement2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        // A.add(34);
        // A.add(35);
        // A.add(27);
        // A.add(42);
        // A.add(5);
        // A.add(28);
        // A.add(39);
        // A.add(20);
        // A.add(28);
        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);

        for (int i : prevSmaller(A)) {
            System.out.println(i);
        }
    }

    static public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        int i = 0;
        while (i < A.size()) {

            while (!st.empty() && st.peek() >= A.get(i)) {
                st.pop();
            }
            if (st.empty()) {
                l.add(-1);
            } else {
                l.add(st.peek());
            }
            st.push(A.get(i));
            i++;
        }
        return l;
    }

    static int min(int a, int b) {
        return a < b ? a : b;
    }
}