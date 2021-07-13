import java.util.ArrayList;

public class Stock {
    private final Balance balance = new Balance();
    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product getProduct(int index) {
        return products.get(index);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getProductQuantity() {
        return products.size();
    }

    public double getBalanceMoney() {
        return balance.getMoney();
    }

    public void sellProduct(Product product) {
        balance.addMoney(product.getValue());
        removeProduct(product);
    }
}
