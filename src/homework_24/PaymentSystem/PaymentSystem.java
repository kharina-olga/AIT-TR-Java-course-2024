package homework_24.PaymentSystem;

public interface PaymentSystem {

    void withdrawMoney(double amount); // Метод для снятия средств со счета
    void depositTransfer(double amount); // Метод для пополнения счета
    double checkBalance(); // Метод для проверки остатка на счете

}
