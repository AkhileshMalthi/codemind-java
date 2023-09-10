import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i=0;i<n;i++) arr[i] = scan.nextInt();
        for (int i=0;i<n;i++) {
            if (i == 0) {
                if (arr[n-1]%2==0 && arr[i+1]%2!=0 || arr[n-1]%2!=0 && arr[i+1]%2==0)
                count++;
            }
            else if (i == n-1) {
               if (arr[0]%2==0 && arr[i-1]%2!=0 || arr[0]%2!=0 && arr[i-1]%2==0)
                count++; 
            }
            else {
                if (arr[i-1]%2==0 && arr[i+1]%2!=0 || arr[i-1]%2!=0 && arr[i+1]%2==0)
                count++;
            }
        }
        System.out.println(count);
    }
}