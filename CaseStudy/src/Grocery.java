public class Grocery extends Product{
    private Date expiry;
    private String nutritionalValue;

    public Grocery(double price, String name, double Tax, int QuantityStock, ProductEnum type, Date expiry, String nutritionalValue) {
        super(price, name, Tax, QuantityStock, type);
        this.expiry = expiry;
        this.nutritionalValue = nutritionalValue;
    }

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(String nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), expiry, nutritionalValue);
    }
}
