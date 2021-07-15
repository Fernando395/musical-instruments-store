public class Balance {
    private double money;

    public void addMoney(double valor) {
        this.money += valor;
    }

    public void withdrawMoney(double valor) {
        if (valor > money) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.money -= valor;
    }

    public double getMoney() {
        return money;
    }
}
