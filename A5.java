import java.util.Scanner;

public class A5 {

    public static void main(String args[]) {
        int a, b;
        System.out.print("Enter two Number...");
        Scanner obj = new Scanner(System.in);

        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("Addition  =" + (a + b));

        System.out.println("substraction  = " + (a - b));

        System.out.println("Division =" + (a / b));

        System.out.println("Remainder =" + (a % b));

        System.out.println("Multipication =" + (a * b));

    }

}
