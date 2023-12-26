import java.util.Scanner;

public class Vote {

    public static void main(String args[]) {
        int age;

        System.out.println("Enter your age");

        Scanner r = new Scanner(System.in);
        age = r.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for votes");
        }

        else {
            System.out.println("Not Eligible for vote");
        }
    }

}
