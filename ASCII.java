import java.util.Scanner;

public class ASCII {

    public static void main(String args[]) {
        char ch;
        System.out.println("Enter any character");
        Scanner r = new Scanner(System.in);
        ch = r.next().charAt(0);

        int A = ch;

        System.out.println("ASCII value of" + ch + "is =" + A);

    }

}
