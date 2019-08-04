import java.util.*;

public class CountASP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, s, p;
        a = s = p = 0;
        String str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') {
                s++;
            }
            if (str.charAt(i) == 'a') {
                a++;
            }
            if (str.charAt(i) == 'p') {
                p++;
            }
        }
        System.out.println(a + " " + s + " " + p);
    }
}