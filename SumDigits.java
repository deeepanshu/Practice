import java.util.*;
import java.math.*;

public class SumDigits {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BigInteger ten = new BigInteger("10");
        for (int i = 0; i < n; i++) {
            System.out.println("N: " + i);
            // String num = ;
            BigInteger bg = scn.nextBigInteger();
            int sum = 0;
            while (bg.intValue() != 0) {
                int d = bg.mod(ten).intValue();
                System.out.println(d + " " + bg);
                sum = sum + d;
                bg = bg.divide(ten);
            }
            System.out.println("res: " + sum);
        }
        scn.close();
    }

}