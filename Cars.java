import java.util.Scanner;

public class Cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        if (n2 > n1) {
            int a = x, b = 0, t = 0;
            while (a >= b) {
                a += n1;
                b += n2;
                t++;
            }
            System.out.println(t);
        }
        else {
            System.out.println("-1");
        }
    }
}