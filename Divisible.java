import java.util.Scanner;

public class Divisible {

    public static void main(String args[]) {
        int n;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if (n % 5 == 0) {

            System.out.println("divisible by 5");

        }

        else {
            System.out.println("not Divible by 5");
        }
    }

}
