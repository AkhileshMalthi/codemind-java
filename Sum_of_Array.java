import java.util.Scanner;
public class Sumofarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int sum = 0;
        for (int i: arr) {
            sum+=i;
        }
        System.out.println(sum);
    }
}