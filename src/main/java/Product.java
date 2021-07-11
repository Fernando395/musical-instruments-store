public class Product {
    protected String brand;
    protected double value;
    protected Provider provider;

    public Product(String brand, double value, Provider provider) {
        this.brand = brand;
        this.value = value;
        this.provider = provider;
    }

    public String getBrand() {
        return brand;
    }

    public double getValue() {
        return value;
    }

    public Provider getProvider() {
        return provider;
    }
}
