import java.util.Scanner;

public class Square1 {

    public static void main(String args[]) {
        int n;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();

        double m = Math.sqrt(n);
        System.out.println("square root of = " + n + "is" + m);
    }

}
