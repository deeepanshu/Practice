import java.util.*;

public class Mingrids {
    /* [(0, 0), (1, 1), (1, 2)] */
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        A.add(0);
        A.add(1);
        A.add(1);
        B.add(0);
        B.add(1);
        B.add(2);
        System.out.println(coverPoints(A, B));
    }

    static public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int z = 0;
        for (int i = 0; i < A.size() - 1; i++) {
            z += Math.max(Math.abs(A.get(i) - A.get(i + 1)), Math.abs(B.get(i) - B.get(i + 1)));
        }
        return z;
    }
}