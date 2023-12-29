import java.util.Scanner;

public class Swap1 {

    public static void main(String args[]) {

        int a, b;

        System.out.println("Enter any two numbers");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();

        System.out.println("Before swapping" + a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping " + a + " " + b);

    }

}
