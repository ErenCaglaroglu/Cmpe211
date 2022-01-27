public class Commission extends Hourly{
    private double totalSales=0;
    private double commissionRate;
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate=commissionRate;
    }
    public void addSales(double totalSales){
        this.totalSales+=totalSales;

    }
    @Override
    public double pay() {

        double payment = super.pay();
        double comission = totalSales*commissionRate/100;
        payment = payment+comission;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString ();
        result += "\nTotal Sales: " + totalSales;
        return result;

    }
}
