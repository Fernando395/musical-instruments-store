public class Stock {
    public static void main(String[] args) {
        Provider provider = new Provider("Fernando", "fe395rodrigues@gmail.com", "51996685590");

        Guitar guitar = new Guitar("tagima", 129.90, provider);
        ElectricGuitar electricGuitar = new ElectricGuitar("folk",169.90,null,"folk-3.2.00");

    }
}
