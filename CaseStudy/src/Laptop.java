public class Laptop extends Electronic{
    private String processor;
    private String screenDimension;
    private int Ram;

    public Laptop(double price, String name, double Tax, int QuantityStock, ProductEnum type, String consumption, Date warranty, String processor, String screenDimension, int ram) {
        super(price, name, Tax, QuantityStock, type, consumption, warranty);
        this.processor = processor;
        this.screenDimension = screenDimension;
        Ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getScreenDimension() {
        return screenDimension;
    }

    public void setScreenDimension(String screenDimension) {
        this.screenDimension = screenDimension;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %d", super.toString(), processor, screenDimension, Ram);
    }
}
