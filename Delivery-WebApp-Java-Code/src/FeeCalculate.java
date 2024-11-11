import javax.swing.*;

public class FeeCalculate extends FeeCompute{
    double km, change;

    public void setSalary(double num) {
        km = num * 15;
    }
    public void setChange(double pay, double cash) {
        change = cash - pay;
    }

    public double getSalary() {
        return km;
    }

    public double getSalary(double non) {
        return 0;
    }
    public double getChange() {
        return change;
    }
    public FeeCalculate(String Name, double Amount, String MOP, double Cash, double CHANGE)
    {
        super(Name, Amount, MOP, Cash);
        change = CHANGE;
    }
    public void displaySummary(){
        JOptionPane.showMessageDialog(null, "NAME: "+ getName()+
                "\nAMOUNT TO PAY: "+getAmount()+ "\nMODE OF PAYMENT: "+ getMOP()+
                "\nAVAILABLE CASH: "+getCash()+ "\nCHANGE: "+ getChange(), "SUMMARY", JOptionPane.INFORMATION_MESSAGE);
    }
    public double getchange() {
        return change;
    }
    public void setchange(double CHANGE) {
        change = CHANGE;
    }


}
