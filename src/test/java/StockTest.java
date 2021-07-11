import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {
    @Test
    public void shouldAddProduct() {
        Stock stock = new Stock();
        Provider provider = new Provider("Fernando", "fe395rodrigues@gmail.com", "51996685590");
        Product product = new Product("Tagima", 129.90, provider);
        stock.addProduct(product);
        assertEquals(product, stock.getProduct(0));
    }

    @Test
    public void shouldRemoveProduct() {
        Stock stock = new Stock();
        Provider provider = new Provider("Fernando", "fe395rodrigues@gmail.com", "51996685590");
        Product product = new Product("Tagima", 129.90, provider);
        stock.addProduct(product);
        assertEquals(product, stock.getProduct(0));
        stock.removeProduct(product);
        Assertions.assertEquals(0, stock.getProductQuantity());

    }
}