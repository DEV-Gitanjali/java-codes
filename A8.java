public class A8 {

    public static void main(String args[]) {

        System.out.println("logical AND");
        System.out.println((10 > 5) && (2 > 1));
        System.out.println((10 > 5) && (2 < 1));
        System.out.println((10 < 5) && (2 < 1));

        System.out.println("logical OR");
        System.out.println((10 > 5) || (2 > 1));
        System.out.println((10 > 5) || (2 < 1));
        System.out.println((10 < 5) || (2 < 1));

        System.out.println("logical NoT");
        System.out.println(!(10 > 5));
        System.out.println(!(10 < 5));

    }

}
