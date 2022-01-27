// *****************************************************
// WeeklySales.java
//
// Sorts the sales staff in ascending order by sales.
// *****************************************************
import java.util.*;
public class WeeklySales
{
    public static void main(String[] args)
    {
        Salesperson [] Salesperson=new Salesperson[10];

        Salesperson[0]=new Salesperson("Don","Trump",1570);
        Salesperson[1]=new Salesperson("Walter","Dick",2800);
        Salesperson[2]=new Salesperson("Doe","Jim",2850);
        Salesperson[3]=new Salesperson("Black","Jane",3000);
        Salesperson[4]=new Salesperson("Jones","James",3000);
        Salesperson[5]=new Salesperson("Jones","Jane",3000);
        Salesperson[6]=new Salesperson("Smith","Walt",3000);
        Salesperson[7]=new Salesperson("Duck","Daffy",4935);
        Salesperson[8]=new Salesperson("Adams","Andy",5000);
        Salesperson[9]=new Salesperson("Taylor","Harry",7300);

        Sorting.insertionSort(Salesperson);




        // TODO: Create an array for 10 Salesperson objects

        // TODO: Populate all the array elements with the values as given in the PDF screenshot

        // TODO: Use insertionSort function for your array

        System.out.println ("\nRanking of Sales for the Week\n");
        for (int i=0;10>i;i++) {

            System.out.println(Salesperson[i]);


        }
        // TODO: Print each array element

    }
}