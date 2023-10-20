public class Table extends Furniture{
    private String Shape;

    public Table(double price, String name, double Tax, int QuantityStock, ProductEnum type, String material, String dimensions, String shape) {
        super(price, name, Tax, QuantityStock, type, material, dimensions);
        Shape = shape;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String shape) {
        Shape = shape;
    }
    @Override
    public String toString() {
        return String.format("%s %s", super.toString(),Shape);
    }
}
