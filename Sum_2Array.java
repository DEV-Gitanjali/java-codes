import java.util.Scanner;

public class Sum_2Array {

    public static void main(String args[]) {
        int a[] = new int[5];
        int sum = 0;

        Scanner r = new Scanner(System.in);

        System.out.println("Enter elements in Arrays");

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }

        System.out.print("Array Elements");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

            sum = a[i] + sum;
        }

        System.out.print("Addition of Arrays = " + sum);
    }

}
