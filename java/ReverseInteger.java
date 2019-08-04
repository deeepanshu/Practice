import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-1146467285));
    }

    static int reverse(int A) {
        int prev_rev_num = 0, rev_num = 0;
        if (A <= -1146467285) {
            return 0;
        }
        boolean neg = A < 0;
        if (neg)
            A *= -1;
        while (A != 0) {
            int curr_digit = A % 10;
            rev_num = (rev_num * 10) + curr_digit;
            if ((rev_num - curr_digit) / 10 != prev_rev_num) {
                return 0;
            }
            prev_rev_num = rev_num;
            A = A / 10;
        }
        if (neg)
            rev_num *= -1;
        return rev_num;
    }
}