public class Furniture extends Product {
    private String material;
    private String Dimensions;

    public Furniture(double price, String name, double Tax, int QuantityStock, ProductEnum type, String material, String dimensions) {
        super(price, name, Tax, QuantityStock, type);
        this.material = material;
        Dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        Dimensions = dimensions;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", super.toString(), material, Dimensions);
    }
}
