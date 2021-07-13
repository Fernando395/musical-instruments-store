import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceTest {

    @Test
    public void shouldAddMoneyToBalance() {
        Balance balance = new Balance();
        balance.addMoney(129.90);
        assertEquals(129.90, balance.getMoney());
        balance.withdrawMoney(129.90);
        assertEquals(0, balance.getMoney());
        assertEquals("Valor Invalido", balance.withdrawMoney(10));
    }
}
