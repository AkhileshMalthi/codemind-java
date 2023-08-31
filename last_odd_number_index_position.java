import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l_odd = 0;
        for (int i=0;i<n;i++) {
            if (scan.nextInt()%2!=0) l_odd = i;
        }
        System.out.println(l_odd);
    }
}