import java.util.Scanner;

public class Calculater {

    public static void main(String args[]) {
        int n1, n2, ch, cal;
        System.out.println("Enter two numbers");
        Scanner r = new Scanner(System.in);

        n1 = r.nextInt();
        n2 = r.nextInt();
        System.out.println("select operation");
        ch = r.nextInt();

        if (ch == 1) {
            cal = n1 + n2;
            System.out.println("ADDITION = " + cal);
        }

        else if (ch == 2) {
            cal = n1 - n2;

            System.out.println("SUBSTRACTION = " + cal);

        }

        else if (ch == 3) {
            cal = n1 * n2;
            System.out.println("MULTIPICATION = " + cal);
        } else if (ch == 4) {
            cal = n1 / n2;
            System.out.println("DIVISION = " + cal);
        }

        else {
            cal = n1 % n2;

            System.out.println("REAMINDER = " + cal);
        }
    }

}
