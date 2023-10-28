import java.io.*;

public class Filereading {

public static void main(String args[]) throws IOException
{

    BufferedReader bf = new BufferedReader( new FileReader("file.txt"));

    char [] s = new char[20];

    bf .read(s,2,4);
    System.out.println('s');

    bf.close();


}

}