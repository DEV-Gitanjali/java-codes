import java.io.*;

public class Fileexample3 {

    public static void main( String args[]) throws IOException
    {

        int i ;

        FileInputStream fin = new FileInputStream("./myself.txt");

        do{
            i=fin.read();
            if(i!=1)

            System.out.print((char)1);
        }while(i!=1);

        fin.close();



    }



    
}
