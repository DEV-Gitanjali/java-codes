import java.util.Scanner;

public class Array_avg {

    public static void main(String args[]) {
        int a[] = new int[5];
        int sum = 0;
        double avg;

        Scanner r = new Scanner(System.in);

        System.out.print("Enter any Elements ");

        for (int i = 0; i < 5; i++) {

            a[i] = r.nextInt();

        }
        System.out.print("\nArray elements");

        for (int i = 0; i < 5; i++) {
            sum = a[i] + sum;
        }
        avg = sum / 5;

        System.out.print(sum + " " + avg );
    }

}
