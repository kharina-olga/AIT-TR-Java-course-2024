package homework_24.PaymentSystem;

public class ElectronicWallet implements PaymentSystem {
    private double balance; // Остаток на счете
    private String currency; // Валюта счета

    public ElectronicWallet(double initialBalance, String currency) {
        this.balance = initialBalance;
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств на счете.");
        } else {
            balance -= amount;
            System.out.println("Снято " + amount + " " + currency + ". Остаток на счете: " + balance + " " + currency + ".");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        balance += amount;
        System.out.println("Зачислено " + amount + " " + currency + ". Остаток на счете: " + balance + " " + currency + ".");
    }

    @Override
    public double checkBalance() {
        System.out.println("Остаток на счете: " + balance + " " + currency + ".");
        return balance;
    }
}

