import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.nextLine();
        String name = scan.nextLine();
        int units = scan.nextInt();
        double bill;
        
        if (units < 200) bill = units*1.20;
        else if (units >= 200 && units < 400) bill = units*1.50;
        else if (units >= 400 && units < 600) bill = units*1.80;
        else bill = units*2.00;
        
        if (bill > 400) {
            bill += bill*0.15;
        }
        else {
            bill += 100;
        }
        
        System.out.printf("%.2f",bill);
    }
}