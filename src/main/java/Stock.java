import java.util.ArrayList;

public class Stock {
    private ArrayList<Product> products = new ArrayList<Product>();

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
}
