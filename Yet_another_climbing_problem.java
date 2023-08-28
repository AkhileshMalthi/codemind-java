import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tcs = scan.nextInt();
        for (int tc=0;tc<tcs;tc++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int moves = 0;
            if (x%y==0) moves = x/y;
            else moves = (x/y) + x%y;
            System.out.println(moves);
        }
    }
}