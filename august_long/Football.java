import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t, n;
        int INT_MIN = -1;
        t = scn.nextInt();
        for (int t_i = 0; t_i < t; t_i++) {
            n = scn.nextInt();
            int goals[] = new int[n];
            for (int i = 0; i < n; i++) {
                int val = scn.nextInt();
                goals[i] = val * 20;
            }
            int max = INT_MIN;
            for (int i = 0; i < n; i++) {
                int val;
                val = scn.nextInt();
                int res = goals[i] - (val * 10);
                goals[i] = res > 0 ? res : 0;
                if(max < goals[i]) {
                    max  = goals[i];
                }
            }
            System.out.println(max);
        }
    }
}