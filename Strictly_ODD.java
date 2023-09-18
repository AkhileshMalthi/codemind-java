import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        String isStrictlyOdd = "True";
        for (int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
            if (arr[i]%2!=0 && i%2==0) {
                isStrictlyOdd = "False";
                break;
            }
        }
        System.out.println(isStrictlyOdd);
    }
}