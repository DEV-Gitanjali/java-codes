import java.util.*;


public class Arrays {


    public static void main(String [] args)
{
      int a[] = new int [10];
      int i;

      Arrays.fill(a,5);
      for( i=0; i<a.length;i++)
      System.out.println(a[i]+" ");

      Arrays.fill(a,5,9,1);

      System.out.println(" ");

      for( i=0; i<a.length; i++)

      System.out.println(a[i]+" ");

 } 
}
