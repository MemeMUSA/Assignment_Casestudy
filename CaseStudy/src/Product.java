public class Product {
    private int id;
    private double price;
    private String name;
    private double Tax;
    private int QuantityStock;
    ProductEnum type;
    private static int count = 0;

    public Product(double price, String name, double Tax, int QuantityStock, ProductEnum type) {
        this.id = ++count;
        this.name = name;
        this.price = price;
        this.Tax = Tax;
        this.type = type;
        this.QuantityStock = QuantityStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double tax) {
        Tax = tax;
    }

    public int getQuantityStock() {
        return QuantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        QuantityStock = quantityStock;
    }

    public ProductEnum getType() {
        return type;
    }

    public void setType(ProductEnum type) {
        this.type = type;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    @Override
    public String toString() {
        return String.format("%-7d %-13f %-8.1s %-13f %-8d %s",id,price,name,Tax,QuantityStock,type);
    }
}
