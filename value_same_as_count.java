import java.util.*;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i=0;i<n;i++) arr[i] = scan.nextInt();
        Arrays.sort(arr);
        int i = 0, c = 0;
        while (i < n) {
            while(i+1 < n && arr[i] == arr[i+1]) {
                c++;
                i++;
            }
            if (++c == arr[i]) count++;
            c = 0;
            i++;
        }
        System.out.println(count);
    }
}