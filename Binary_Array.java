import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        String result = "True";
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if (arr[i] == 0 || arr[i] == 1) continue;
            else {
                result = "False";
                break;
            }
        }
        System.out.println(result);
    }
}