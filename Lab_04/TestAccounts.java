//************************************************************
// TestAccounts
// A simple program to test the numAccts method of the
// Account class.
//************************************************************
import java.util.Scanner;
public class TestAccounts
{
    public static void main(String[] args)
    {

        Account testAcct=new Account(5000,"Eren Çağlaroğlu"); // Create a test Account object
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();

        System.out.println(testAcct.toString());
        // Create the #num new Accounts and print the appropriate messages (see demo link from pdf) in a loop
        // TODO
    }
}