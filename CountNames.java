import java.util.*;

public class CountNames {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        // System.out.println(s);
        String[] names = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : names) {
            if (map.containsKey(name)) {
                map.replace(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        int f = -1;
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
            if (map.get(key) > 1) {
                f = 1;
                System.out.println(key + " " + map.get(key));
            }
        }
        if (f < 0) {
            System.out.println(-1);
        }
        scn.close();
    }
}