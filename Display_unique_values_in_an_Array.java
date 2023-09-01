import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = scan.nextInt();
        int[] countarr = new int[n];
        int count;
        int r = 0;
        for (int i=0;i<n;i++) {
            count = 0;
            for (int j=0;j<n;j++) {
                if (arr[j] == arr[i]) count++;
            }
            countarr[i] = count;
        }
        
        for (int i=0;i<n;i++) {
            if (countarr[i]==1) {
                System.out.print(arr[i]+" ");
                r = 1;
            }
        }
        if (r == 0) {
            System.out.println("-1");
        }
    }
}