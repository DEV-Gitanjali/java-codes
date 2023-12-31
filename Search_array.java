import java.util.Scanner;

public class Search_array {

    public static void main(String args[]) {
        int a[] = new int[5];
        int n, count = 0;

        Scanner r = new Scanner(System.in);
        System.out.println("Enter elements array");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }

        System.out.print("Array Elements..");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nEnter search elements");

        n = r.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }

            if (count > 0) {
                System.out.print("item Found" + count + "times");
            }

            else {
                System.out.print("items not found");
            }
        }
    }

}
