
// this is called function hiding
class Employee {
   public static void f1() {
      System.out.println("SUBHAM");
   }

}

class department extends Employee {
   public static void f1() {
      {
         System.out.println("project manager");
      }
   }

   public class Example {
   public static void main(String[] args) {
      department.f1();
   }

}
