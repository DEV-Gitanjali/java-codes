import java.util.Scanner;

public class Reversesum {

    public static void main(String args[]) {
        int n, r, sum = 0;
        System.out.println("ENtre any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();

        while (n > 0) {
            r = n % 10;
            sum = sum + r;
            n = n / 10;

        }
        System.out.println("sum of the digits = " + sum);

    }

}
