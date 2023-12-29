import java.util.Scanner;

public class Arm {

    public static void main(String args[]) {
        int n, ar = 0, rem, c;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        c = n;

        while (n > 0) {
            rem = n % 10;
            ar = (rem * rem * rem) + ar;
            n = n / 10;

        }

        if (c == ar) {
            System.out.println("Armstrong Number");
        }

        else {
            System.out.println("Not Armstrong Number");
        }
    }

}
