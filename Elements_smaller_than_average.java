import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int c = 0;
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        double avg = sum/n;
        for (int i=0;i<n;i++) {
            if (arr[i] <= avg) c++;
        }
        System.out.println(c);
    }
}