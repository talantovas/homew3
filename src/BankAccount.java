
public class BankAccount {
    private double amount;

    public BankAccount(double initialAmount) {
        this.amount = initialAmount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Внесено: " + sum + " сом. Текущий баланс: " + amount + " сом");
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств", amount);
        }
        amount -= sum;
        System.out.println("Снято: " + sum + " сом. Текущий баланс: " + amount + " сом");
    }
}
