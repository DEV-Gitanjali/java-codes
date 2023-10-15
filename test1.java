public class test1 {
    private static int k;
    static {
        System.out.println(" static initialization Block:k=" + k);
        k = 10;
    }

    public static void main(String[] args) {
        new test1();
    }

}
