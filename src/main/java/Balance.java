public class Balance {
    private double money;

    public void addMoney(double valor) {
        this.money += valor;
    }

    public String withdrawMoney(double valor) {
        if (valor > money) {
            return "Valor Invalido";
        }
        this.money -= valor;
        return "Valor modificado com sucesso";
    }

    public double getMoney() {
        return money;
    }
}
