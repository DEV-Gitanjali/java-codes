class Parent {
    public static void f1() {
        {
            System.out.println("subu");
        }
    }
}

class Child extends Parent {

}

public class gitu {
public static void main(String[] args) {
        Child.f1();
