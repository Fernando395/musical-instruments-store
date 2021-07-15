import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProviderTest {
    @Test
    public void shouldGetAttributes(){
        Provider provider = new Provider("Paulo","paulo@gmail.com.br","51995788389");
        assertEquals("Paulo",provider.getName());
        assertEquals("paulo@gmail.com.br",provider.getEmail());
        assertEquals("51995788389",provider.getContact());
    }
}
