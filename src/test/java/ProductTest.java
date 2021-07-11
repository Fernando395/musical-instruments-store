
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    public void shouldGetAttributes() {
        Provider provider = new Provider("Fernando", "fe395rodrigues@gmail.com", "51996685590");
        Product product = new Product("Tagima", 129.90, provider);

        assertEquals("Tagima", product.getBrand());
        assertEquals(129.90, product.getValue());
        assertEquals(provider, product.getProvider());


    }
}
