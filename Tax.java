import java.util.Scanner;

public class Tax {

    public static void main(String args[]) {
        int sal;
        double tax;
        System.out.println("Enter salary");
        Scanner r = new Scanner(System.in);

        sal = r.nextInt();

        if (sal <= 10000) {
            System.out.println(sal + " no tax");
        }

        else if (sal > 10000 && sal <= 100000) {

            tax = sal * 0.10;

            System.out.println(sal + " " + tax);
        }

        else {

            tax = sal * 0.20;

            System.out.println(sal + " " + tax);

        }

    }

}
