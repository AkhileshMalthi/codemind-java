import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        String isAllEven = "True";
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if (arr[i]%2!=0) {
                isAllEven = "False";
                break;
            }
        }
        System.out.println(isAllEven);
    }
}