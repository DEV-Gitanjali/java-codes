import java.util.Scanner;

public class ElseIf {

    public static void mian(String args[]) {
        int marks;
        System.out.println("Enter marks..");

        Scanner ref = new Scanner(System.in);
        marks = ref.nextInt();

        if (marks > 80) {
            System.out.println("Topper");
        }

        else if (marks < 80 && marks >= 60) {
            System.out.println("First");
        }

        else {
            System.out.println("second");
        }
    }

}
