import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();
        double f = 32+(c*9/5);
        System.out.printf("%.2f",f);
    }
}