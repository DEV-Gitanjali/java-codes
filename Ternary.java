public class Ternary {

    public static void main(String args[]) {
        // int a = 10, b = 20, max;
        // max = (a > b) ? a : b;

        // System.out.println(max);

        int x = 34, y = 25, z = 78, high;

        high = (x < y) ? (x < z ? z : x) : (y < z ? z : y);
        System.out.println(high);

    }

}
