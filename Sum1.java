import java.util.Scanner;

public class Sum1 {

    public static void main(String args[]) {
        int n, sum = 0;

        System.out.println("enter no of term ");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("ADDITION" + sum);
    }

}
