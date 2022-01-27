// *******************************************************
// Salesperson.java
//
// Represents a sales person who has a first name, last
// name, and total number of sales.
// *******************************************************
public class Salesperson implements Comparable
{
    private String firstName, lastName;
    private int totalSales;
    //------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    //------------------------------------------------------
    public Salesperson (String first, String last, int sales)
    {
        this.firstName=first;
        this.lastName=last;
        this.totalSales=sales;
        //TODO
    }
    //-------------------------------------------
    // Returns the sales person as a string.
    //-------------------------------------------
    public String toString()
    {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    //--------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    //--------------------------------------------------
    public int compareTo(Object other) {
        Salesperson s = (Salesperson) other;
        if (this.getSales() > s.getSales()) {
            return this.getSales() - s.getSales();

        } else if (s.getSales() > this.getSales()) {

            return s.getSales() - this.getSales();
        } else {
            String isim1=this.lastName+this.firstName;
            String isim2 = s.lastName+s.firstName;

            return isim1.compareTo(isim2);

          }
        //TODO
    }
    //-------------------------
    // First name accessor.
    //-------------------------
    public String getFirstName()
    {
      return this.firstName;
        //TODO
    }
    //-------------------------
    // Last name accessor.
    //-------------------------
    public String getLastName()
    {
        return this.lastName;
        //TODO

    }
    //-------------------------
    // Total sales accessor.
    //-------------------------
    public int getSales()
    {
        return this.totalSales;
        //TODO
    }
}