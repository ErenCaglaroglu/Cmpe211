import java.util.*;
//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************
public class Account
{
    private double balance;
    private String name;
    private long acctNum;
    Random rand= new Random();
    private static int numAccounts=0;

    public static int getNumAccounts() {
        return numAccounts;
    }



    //-------------------------------------------------------------------------------------------------
    //Constructor -- initializes balance and owner as specified, randomly generates the account number
    //-------------------------------------------------------------------------------------------------
    public Account(double initBal, String owner)
    {
        this.balance=initBal;
        this.name=owner;
        acctNum= rand.nextInt();
        numAccounts++;

        // TODO
    }


    //-------------------------------------------------
    // Returns balance.
    //-------------------------------------------------
    public double getBalance()
    {
        return balance;
    }
    //-------------------------------------------------
    // Returns a string containing the name, account number, and balance.
    //-------------------------------------------------
    public String toString()
    {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    }
}