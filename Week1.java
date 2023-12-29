import java.util.Scanner;

public class Week1 {

    public static void main(String args[]) {
        int n;
        System.out.println("enter any day");
        Scanner r = new Scanner("System.in");
        n = r.nextInt();

        switch (n) {
            case 0:
                System.out.println("sunday");
                break;

            case 1:
                System.out.println("monnday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");

                break;
            case 4:
                System.out.println("thrusday");

                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;

            default:
                System.out.println("invalid");
                break;

        }

    }

}
