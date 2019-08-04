import java.util.*;
import java.math.*;

class ExtendedNum {
    int originalValue;
    long modifiedValue;

    public ExtendedNum(int originalValue, int n) {
        this.originalValue = originalValue;
        String s = Integer.toString(originalValue);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        while (ans.length() <= n + 1)
            ans.append(sb);

        s = ans.toString().substring(0, n + 1);
        modifiedValue = Long.parseLong(s);
    }

    public String toString() {
        return "[" + modifiedValue + ", " + originalValue + "]";
    }
}

public class LargestNumber {

    static public String largestNumber(ArrayList<Integer> arr) {
        int n = Collections.max(arr).toString().length();
        ArrayList<ExtendedNum> al = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            al.add(new ExtendedNum(arr.get(i), n));
        }
        Collections.sort(al, (p1, p2) -> (int) (p2.modifiedValue - p1.modifiedValue));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < al.size(); i++)
            sb.append(new StringBuilder(Long.toString(al.get(i).originalValue)));
        BigInteger bi = new BigInteger(sb.toString());
        return bi.toString();

    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 34, 3, 98, 9, 76, 45, 4, 12, 121 };
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(34);
        l.add(3);
        l.add(98);
        l.add(9);
        l.add(76);
        l.add(45);
        l.add(4);
        l.add(12);
        l.add(121);

        System.out.println(LargestNumber.largestNumber(l));
    }
}