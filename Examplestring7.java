public class  Examplestring7{

    public static void main(String args[])
    {
        String s1 = new String("XComputer");
        String s2 = new String ("computer");

        int i = s1.compareTo(s2);
 
        if(i==0)
        System.out.println("String are same");

        else if(i>0)

        System.out.println("oppositte to dictionary order");

        else


        System.out.println("dictionary order");

    }
    
}