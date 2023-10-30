public class Generic {

    public <E> void PrintArry(E[] s)

    {
        for(int i =0; i<=s.length;i++)
        {
            System.out.println(s[i]);
        }
    }

    public static void main(String args[])

    {
        Generic g1 = new Generic();
        String countries[] = new String []{"my" ,"subham","shreyans" };
        //Integer numbers[] = {12,23,34,45};

        g1.PrintArry(countries);

        //g1.PrintArry(numbers);


    }
    
}
