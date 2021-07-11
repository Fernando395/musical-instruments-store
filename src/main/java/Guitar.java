public class Guitar extends Product {


    public Guitar(String brand, double value, Provider provider) {
        super(brand, value, provider);
        addingGuitar();
    }

    public void addingGuitar() {
        System.out.println("Novo violão adicionado");
        System.out.println("Dados do violão");
        System.out.println("Marca:" + brand);
        System.out.println("Valor:" + value);
        if (provider != null) {
            provider.mostrarDados();
        }
        System.out.println("Fornecedor não cadastrado");

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
