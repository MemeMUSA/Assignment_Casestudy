public class Seat extends Furniture{
    private int LoadCapacity;

    public Seat(double price, String name, double Tax, int QuantityStock, ProductEnum type, String material, String dimensions, int loadCapacity) {
        super(price, name, Tax, QuantityStock, type, material, dimensions);
        LoadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        LoadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return String.format("%s %d", super.toString(), LoadCapacity);
    }
}
