import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vowels = "AEIOUaeiou";
        if (vowels.contains(""+scan.next().charAt(0))) System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}
