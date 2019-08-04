import java.util.*;

public class SimplifyDirectory {
    public static void main(String[] args) {
        System.out.println(simplify("/a/./b/../../c/"));
    }

    public static String simplify(String A) {
        String[] locations = A.split("/");

        Stack<String> st = new Stack<>();
        int i = 0;
        while (i < locations.length) {
            if (locations[i].equals("") || locations[i].equals(".")) {
                i++;
                continue;
            }
            if (locations[i].equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(locations[i]);
            }
            i++;
        }
        if (st.empty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.toString();
    }
}