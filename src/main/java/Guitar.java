public class Guitar extends Product {

    public Guitar(String brand, double value, Provider provider) {
        super(brand, value, provider);
        addingProduct();
    }

    public void applyingDiscount(double discount) {
        if (discount > 0.3) {
            System.out.println("Desconto superior a 30% não permitido");
        }
        value -= value * discount;
    }

    public String getBrand() {
        return brand;
    }

    public double getValue() {
        return value;
    }
}
