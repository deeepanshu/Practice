import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LCS {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sze = s.nextInt();
        int[] arr = new int[sze];
        for (int index = 0; index < sze; index++) {
            arr[index] = s.nextInt();
        }
        ArrayList<Integer> ans = longestSubsequence(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> longestSubsequence(int[] arr) {
        // Write your code here
        HashSet<Integer> s = new HashSet<>();
        int ans = 0;
        int start = 0;
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            s.add(arr[i]);
        for (int i = 0; i < n; i++) {
            if (!s.contains(arr[i] - 1)) {
                int j = arr[i];
                while (s.contains(j))
                    j++;
                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                    start = i;
                }

            }
        }
        ArrayList<Integer> a = new ArrayList<>();
        int toadd = arr[start];
        for (int i = start; i < (start + ans); i++) {
            a.add(toadd++);
        }
        return a;
    }
}
