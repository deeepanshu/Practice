import java.util.*;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[][]= new int[3][3];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j=0; j<n; j++) {
                sum += arr[j][i];
            }
            if(sum!=0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        scn.close();
    }
}