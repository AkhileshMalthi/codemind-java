import java.util.Scanner;

public class CarChoice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 1) System.out.println(0);
        else if (n == 2) System.out.println(1);
        else System.out.println(2);
    }
}