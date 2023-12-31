import java.util.Scanner;

public class Copy_array {

    public static void main(String args[]) {
        int a[] = new int[5];
        int b[] = new int[5];

        Scanner r = new Scanner(System.in);
        System.out.print("Enter value in first array");
        for (int i = 0; i < 5; i++) {
            a[i] = r.nextInt();
        }

        System.out.print("First array element");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\n second array element = ");

        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }

    }

}
