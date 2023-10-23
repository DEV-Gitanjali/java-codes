public class Examplestring8 {


    public static void main(String args[])
    {
        String s1 = "computer" ;
        String s2 = "computer" ;

        String  s3 = new String("computer");

        System .out . printf("result 1:"  +(s1==s2) );
        
        System.out.println("result 2" + s1.equals(s2));

        System.out.println("result 3" + (s1==s3));

        System .out.println("result 4" +s1. equals(s3));

    }
    
}
