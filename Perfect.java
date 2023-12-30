import java.util.Scanner;

public class Perfect {

    public static void main(String ags[]) {
        int n, sum = 0;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);

        n = r.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (n == sum) {
            System.out.println("perfect number");
        }

        else {
            System.out.println("not perfect number");
        }

    }

}
