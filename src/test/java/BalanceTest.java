import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalanceTest {

    @Test
    public void balanceShouldNotBeNegative() {
        Balance balance = new Balance();
        assertThrows(IllegalArgumentException.class, () -> {
            balance.withdrawMoney(50000.00);
        });
    }

    @Test
    public void shouldAddMoneyToBalance() {
        Balance balance = new Balance();
        balance.addMoney(129.90);
        assertEquals(129.90, balance.getMoney());
    }

    @Test
    public void shouldDrawMoneyToBalance() {
        Balance balance = new Balance();
        balance.addMoney(129.90);
        balance.withdrawMoney(129.90);
        assertEquals(0, balance.getMoney());
    }
}
