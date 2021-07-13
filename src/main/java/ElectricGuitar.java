public class ElectricGuitar extends Guitar {
    String controller;

    public ElectricGuitar(String marca, double valor, Provider provider, String controller) {
        super(marca, valor, provider);
        this.controller = controller;
        addingProduct();
    }

    public String getController() {
        return controller;
    }
}
