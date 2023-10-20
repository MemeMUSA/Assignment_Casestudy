public class Electronic extends Product {
    private String Consumption;
    private Date warranty;

    public Electronic(double price, String name, double Tax, int QuantityStock, ProductEnum type, String consumption, Date warranty) {
        super(price, name, Tax, QuantityStock, type);
        this.Consumption = consumption;
        this.warranty = warranty;
    }

    public String getConsumption() {
        return Consumption;
    }

    public void setConsumption(String consumption) {
        Consumption = consumption;
    }

    public Date getWarranty() {
        return warranty;
    }

    public void setWarranty(Date warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), Consumption, warranty);
    }
}
