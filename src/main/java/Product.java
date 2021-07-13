public class Product {
    protected String brand;
    protected double value;
    protected Provider provider;

    public Product(String brand, double value, Provider provider) {
        this.brand = brand;
        this.value = value;
        this.provider = provider;
    }

    public void addingProduct() {
        System.out.println("Novo produto adicionado");
        System.out.println("Dados do Produto");
        System.out.println("Marca:" + brand);
        System.out.println("Valor:" + value);
        if (provider != null) {
            provider.mostrarDados();
        }
        System.out.println("Fornecedor não cadastrado");
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
