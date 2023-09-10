import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        for (int i=0;i<tc;i++) {
            double x1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y1 = scan.nextDouble();
            double y2 = scan.nextDouble();
            if (y1/x1 > y2/x2) System.out.println(1);
            else if (y1/x1 == y2/x2) System.out.println(0);
            else System.out.println(-1);
        }
    }
}