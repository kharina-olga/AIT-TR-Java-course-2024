package homework_24.PaymentSystem;

public class PaymentSystemMain {
        public static void main(String[] args) {
            // Создаем банковский счет с начальным балансом в евро
            BankAccount bankAccount = new BankAccount(500);
            bankAccount.depositTransfer(100); // Пополнение счета
            bankAccount.withdrawMoney(200); // Снятие средств
            bankAccount.checkBalance(); // Проверка баланса

            // Создаем электронный кошелек с начальным балансом в долларах
            ElectronicWallet wallet = new ElectronicWallet(300, "USD");
            wallet.depositTransfer(50); // Пополнение кошелька
            wallet.withdrawMoney(100); // Снятие средств
            wallet.checkBalance(); // Проверка баланса
        }

}
