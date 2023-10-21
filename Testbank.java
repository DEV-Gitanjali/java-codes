abstract class      Bank{

    abstract int  interest ();
}

class  SBI extends Bank{

    int  interest()
    {return 7 ;}
}

class RBI extends  Bank{

    int interest()
    {return 8 ;}
}


public class Testbank {

public static void main(String args[])
{
    Bank b ;

    b=new SBI();

    System.out.println("rate of interest"  + b.interest() + "%");

    b= new RBI();

    System.out.println("rate of interest"   +  b.interest() + "%");

}
    
}
