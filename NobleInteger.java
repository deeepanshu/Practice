import java.util.*;

public class NobleInteger {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // -4, -2, 0, -1, -6
        list.add(-1);
        list.add(-2);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(-3);
        // list.add(5);
        // list.add(3);
        System.out.println(list);
        System.out.println(solve(list));
    }

    static public int solve(ArrayList<Integer> A) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(A);
        A.clear();
        A.addAll(set);

        Collections.sort(A);
        System.out.println(A);
        for (int i = 0; i < A.size(); i++) {
            if (Math.abs(A.get(i)) == (A.size() - i - 1)) {
                return 1;
            }
        }

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < A.size(); i++) {
        // for (int j = 0; j < A.size(); j++) {

        // if (A.get(i) < A.get(j)) {
        // if (map.containsKey(A.get(i))) {
        // map.put(A.get(i), map.get(A.get(i)) + 1);
        // } else {
        // map.put(A.get(i), 1);
        // }
        // }
        // }
        // }
        // for (Integer k : map.keySet()) {
        // System.out.println(k + " " + map.get(k));
        // if (Math.abs(k) == map.get(k)) {
        // return 1;
        // }
        // }
        return -1;
    }
}