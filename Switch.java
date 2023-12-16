import java.util.Scanner;

public class Switch {

    public static void main(String args[]) {

        int a = 10, b = 20, ch;
        System.out.println("Enter user choice...");
        Scanner r = new Scanner(System.in);
        ch = r.nextInt();

        switch (ch) {
            case 1:
                System.out.println("sum " + (a + b));
                break;

            case 2:
                System.out.println("sub " + (a - b));
                break;

            case 3:
                System.out.println("multi " + (a * b));
                break;

            case 4:
                System.out.println("devide " + (a / b));
                break;
            default:
                System.out.println("invalid choice..");

        }

        System.out.println("out of switch..!");

    }

}
