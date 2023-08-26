import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int s = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(2*t*s*b*512);
    }
}