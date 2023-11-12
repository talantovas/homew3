public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(15000);
        System.out.println("Начальный баланс: " + account.getAmount() + " сом");
        account.deposit(5000);
        try {

            while (true) {
                account.withdraw(6000);

            }
        } catch (LimitException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Оставшаяся сумма: " + e.getRemainingAmount() + " сом");
        }

    }
}