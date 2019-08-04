import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase().replace(" ", "");

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) || Character.isDigit(c))
                sb.append(c);
        }
        str = sb.toString();

        int flag = 1;
        for (int i = 0; i <= ((str.length() / 2) - 1); i++) {
            System.out.println(str.charAt(i) + " " + str.charAt(str.length() - 1 - i));
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                flag = -1;
                break;
            }
        }

        if (flag < 1) {
            System.out.println("NO");
        } else {
            System.out.println("YAY");
        }
    }
}