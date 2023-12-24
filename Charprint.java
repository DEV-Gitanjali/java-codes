import java.util.Scanner;

public class Charprint {

    public static void main(String args[]) {
        char ch;
        System.out.println("pleasse enter character");

        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);
        System.out.println(ch);

    }

}
