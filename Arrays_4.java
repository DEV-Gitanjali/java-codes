import java.util.Scanner;

public class Arrays_4 {

    public static void main(String args[]) {
        int a[] = new int[5];

        Scanner r = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();

        }

        System.out.println("array elements");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\n array reverse  number = ");

        for (int i = a.length - 1; i >= 0; i--)

        {
            System.out.print(a[i] + " ");
        }
    }

}
