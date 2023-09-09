import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if ((scan.nextInt())%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}