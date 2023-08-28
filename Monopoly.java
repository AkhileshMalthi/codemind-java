import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        for (int t=0;t<tc;t++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            String r="NO";
            if (a > b+c || b > a+c || c > a+b) r = "YES";
            System.out.println(r);
        }
    }
}