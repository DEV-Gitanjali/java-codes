class Account{

    int acc_no;

    String name;
    float amount;

    void insert(int acc, String nm,float amt)
{
    acc_no=acc;
    name=nm;
    amount=amt;

}

    void deposit(float amt)
    {
        amount=amount+amt;
        System.out.println(amt+"deposited");


    }

    void withdraw(float amt)
    {

        if(amount<amt)
        {
            System.out.println("insufficient  balance");


        }

        else{

            amount=amount-amt;
            System.out.println(amt+ "withdraw");
        }
    }

    void checkbalance( )
    {
        System.out.println("balance is:"+ amount);
    }
    
    void disply(){

        System.out.println(acc_no+" "+name+" "+amount);
    }

}





public class TestAccount {

    public static void main( String args[])
  {
    Account a1= new Account();
    a1.insert(234568,"ankit",1000);
    a1.disply();
    a1.checkbalance();
    a1.deposit(40000);
    a1.checkbalance();
    a1.withdraw(20000);
    a1.checkbalance();

  }
    
}
