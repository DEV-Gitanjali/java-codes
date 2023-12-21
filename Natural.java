import java.util.Scanner;

public class Natural {

    public static void main(String args[]) {
        int n;
        System.out.println("enter no. of term");

        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }

}
