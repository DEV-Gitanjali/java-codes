import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {2 
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before swapping /nx=" + x + "\ny=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping /nx=" + x + "/ny=" + y);

    }

}
