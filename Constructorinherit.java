class A{

    int a;

    public A()

    {System.out.println("class A1");}


}

class B extends A{

    int b;
    public B()


    { 
        
        this (4);
        
        System.out.println("class B1");
    }
}

public B(int k)
{
    System.out.println("classB2");
}


public class Constructorinherit {

    public static void main(String args[])
    {

    B obj=new B();


    }



    
}
