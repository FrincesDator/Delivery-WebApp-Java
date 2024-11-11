public abstract class FeeCompute {
    private double TotalDeliveryFee, Amount, Cash;
    private double discount, discount1, rush;
    private String Name, MOP;
    public void setNewTotal(double WorthOfFood, double deliveryFee, double discount, double rush){
        TotalDeliveryFee = WorthOfFood + (deliveryFee - discount) + rush;
    }
    public void setRush(double deliveryFee){
        rush =  deliveryFee * 0.20;
    }
    public void setDiscount(double deliveryFee){
        discount = deliveryFee * 0.10;
    }
    public void setDiscount1(double deliveryFee){
        discount1 = deliveryFee * 0.20;
    }
    public double getNewTotal()
    {
        return TotalDeliveryFee;
    }
    public double getDiscount(){
        return discount;
    }
    public double getDiscount1(){
        return discount1;
    }
    public double getRush(){
        return rush;
    }
    public FeeCompute(String Name, double Amount, String MOP, double Cash){
        Name = Name;
        Amount = Amount;
        MOP = MOP;
        Cash = Cash;
    }

    public void setName(String NAME){
        Name = NAME;
    }
    public void setAmount(double AMOUNT){
        Amount = AMOUNT;
    }
    public void setMOP(String MOP1){
        MOP = MOP1;
    }
    public void setCash(double CASH){
       Cash = CASH;
    }

    public String getName(){
        return Name;
    }
    public double getAmount(){
        return Amount;
    }
    public String getMOP(){
        return MOP;
    }
    public double getCash(){
        return Cash;
    }

}
