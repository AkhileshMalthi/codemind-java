import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n>12 || n < 1) System.out.println("-1");
        else if (n>=4 && n<=6) System.out.println("Summer");
        else if (n>=7 && n<=10) System.out.println("Rainy");
        else if (n>=2 && n<=3) System.out.println("Spring");
        else System.out.println("Winter");
    }
}