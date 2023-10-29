 class outer {
    class Inner{

        void subu()
        {
            System.out.println("subu");
        }


    }


    public class Exampleouter{


        public static void main(String args[])
        {
            outer out =new outer();
            outer.Inner oi =  out.new Inner();

            oi.subu();
        }
    }
    
}
