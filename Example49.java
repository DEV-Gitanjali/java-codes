import java.util.*;

public class Example49 {

    public static void main(String args[])
    {

        Vector v = new Vector();

        v.addElement("one");

        v.addElement("two");
        v.addElement("three");
         

        System.out.println(v);
        Enumeration e = v.Element();
        
        while (e.hasMoreElements())

        String s = (String )e.nextElement();

        System.out.println(s);

    }
}
    
}
