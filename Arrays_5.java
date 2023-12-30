import java.util.Scanner;

public class Arrays_5 {

    public static void main(String args[]) {
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("Arrays elements = ");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("Array Length = " + a.length);
    }

}
