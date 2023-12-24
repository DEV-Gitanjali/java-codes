import java.util.Scanner;

public class Check {
    public static void main(String args[]) {
        char ch;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
            System.out.println("vowel letter");
        }

        else {
            System.out.println("consonant");
        }
    }

}
