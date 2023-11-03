class Rectangle{

    int length;
    int width;

    void insrt(int l, int w)
    {
        length = l;
        width = w ;
    }

    void calculationArea()
    {
        System.out.println(length*width);

    }
}


public class TestRectangle1 {

    public static void main(String args[])
    {

    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();

      r1.insrt(11,5);

       r2.insrt(3,5);

      r1.calculationArea();
      r2.calculationArea();


    }

    
}
