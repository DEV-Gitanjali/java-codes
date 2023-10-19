

public class Constructor {

    private int  a, b, c ;

    public Constructor()
    {
        a=5; b=10 ; c=15;
    }

    public Constructor (int A , int B , int C )
    {a=A ;b=B; c=C ; }

    public static void main(String args[])

    {
        Constructor m1 =  new Constructor() ;

        Constructor m2= new Constructor(23, 34, 45) ;
            
        
    }

    
}
