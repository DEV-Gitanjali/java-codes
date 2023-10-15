import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int X, Y;
        System.out.println("Enter X and Y ");
        Scanner in = new Scanner(System.in);
        X = in.nextInt();
        Y = in.nextInt();
        System.out.println("Before swapping \n x=" + X + " \n y=" + Y);
        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.println("After swapping \n x=" + X + " \n y=" + Y);
    }

}
