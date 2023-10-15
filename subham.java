class A {
    public A() {
        System.out.println("A1");
    }
}

class B extends A {
    public B() {
        this(4);
        System.out.println("B1");
    }

    public B(int k) {
        System.out.println("B2");
    }
}

public class subham {
    public static void main(String[] args) {
        B ol = new B();
    }
}
