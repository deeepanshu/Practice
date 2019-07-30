import java.util.Scanner;

public class Murder {

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n-- > 0) {
            int t = scn.nextInt();
            int arr[] = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = scn.nextInt();
            }
            int bound = arr[t - 1];
            long sum = 0;
            for (int i = t - 2; i >= 0; i--) {
                if (bound > arr[i]) {
                    sum += arr[i];
                }
            }
            System.out.println(sum);
        }
        scn.close();
    }

}