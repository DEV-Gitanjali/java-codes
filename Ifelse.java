
import java.util.Scanner;

public class Ifelse {

    public static void main(String args[]) {
        int n;

        System.out.println("ENter any number..!");

        Scanner r = new Scanner(System.in);

        n = r.nextInt();
        if (n >= 0) {
            System.out.println("+ve number");
        }

        else {
            System.out.println("-ve number");
        }

    }

}
