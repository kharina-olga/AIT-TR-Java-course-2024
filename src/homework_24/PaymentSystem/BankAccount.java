package homework_24.PaymentSystem;

public class BankAccount implements PaymentSystem {
    private double balance; // Остаток на счете

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
        } else {
            balance -= amount;
            System.out.println("Снято " + amount + " EUR. Остаток на счете: " + balance + " EUR.");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Зачислено " + amount + " EUR. Остаток на счете: " + balance + " EUR.");
    }

    @Override
    public double checkBalance() {
        System.out.println("Остаток на счете: " + balance + " EUR.");
        return balance;
    }
}

