import java.util.Scanner;

public class Table {

    public static void mian(String args[]) {
        int num;

        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        num = r.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

}
