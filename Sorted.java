import java.util.*;

public class Sorted {

    public static void main(String args[])
    {
        TreeSet  t = new TreeSet();

        t.add("B");
        t.add("D");
        t.add("C");
        t.add("A");

       // System.out.println(t.last());

       //System.out.println(t.first());

      // System.out.println(t.headSet("C"));

      //System.out.println(t.tailSet("C"));

      System.out.println(t.subset("B" ,"D"));
    }


    
}
