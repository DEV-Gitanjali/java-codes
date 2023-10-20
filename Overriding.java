class A{ //car

    public void  f1 (int x)
    {
        System.out.println("class A");


    }
}

class B extends A{//sportscar

    public void f1(int x)
    {
        System.out.println("class B");
    }
}


public class Overriding {

    public static void main(String args[])
    {
        B obj = new B ();
        obj .f1(5);
    }
    
}
