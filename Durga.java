interface  Gita{

    void pooja();

}


public class Durga  implements Gita {

   public  void pooja(){
    
        System.out.println("HAPPY DURA PUJA TO ALL OF YOU FROM GITA side");
    
    }

    public static void main(String args[])
    {
      Gita  obj = new Durga ();
       
       obj. pooja();
    }
    
}
