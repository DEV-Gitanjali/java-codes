interface Drawable{
    void draw();
   
}

class Circle implements Drawable{

    public void draw()
    {
        System.out.println("drawing circle");
    }
}


class rectangle implements Drawable{

    public void Draw()
    {
        System.out.println("drawing rectangle");
    }
}


public class Testinterface1 {

    public static void main(String args[])
    {

        Drawable obj = new Circle();

        obj .Draw();
    }
    
}
