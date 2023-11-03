class Student{

    int regno;
    String name;

    void insertRecord(int r,String n)
     {
        regno=r;
        name=n;
     }

     void displayInformation()
     {
        System.out.println(regno + " " +name);
     }
}


public class TestStudent3 {

    public static void main(String args[])
    {
        Student s1=new Student();

        s1.insertRecord(73, "subham kumar pradhan");

        s1.displayInformation();
    }
    
}
