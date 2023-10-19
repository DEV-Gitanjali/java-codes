public class Teacher1 {

    int id;
    String name;

    Teacher1( int i, String n)
    {

        id =i ;
        name = n;
    
    }
    void Disply(){
        System.out.println(id +" " +name);
    }

    public static void main(String args[])
    {
        Teacher1 t1 = new Teacher1(28,"ASIT KUMAR");

        Teacher1 t2 = new Teacher1(23, "KAMIN MAM");
    }
}
