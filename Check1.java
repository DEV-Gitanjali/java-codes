import java.util.Scanner;

public class Check1 {

    public static void main(String args[]) {
        int n;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        if (n > 0) {
            System.out.println("positive number");
        }

        else if (n < 0) {

            System.out.println("negative number");

        }

        else {

            System.out.println("niether positive nor negative");

        }
    }

}
