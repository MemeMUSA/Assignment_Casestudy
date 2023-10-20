public class Smartphone extends Electronic{
    private String OperatingSystem;
    private String Storage;
    private String Camera;

    public Smartphone(double price, String name, double Tax, int QuantityStock, ProductEnum type, String consumption, Date warranty, String operatingSystem, String storage, String camera) {
        super(price, name, Tax, QuantityStock, type, consumption, warranty);
        this.OperatingSystem = operatingSystem;
        this.Storage = storage;
        this.Camera = camera;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }
    @Override
    public String toString() {
        return String.format("%s %s %s %s", super.toString(),OperatingSystem,Storage,Camera);
    }
}
