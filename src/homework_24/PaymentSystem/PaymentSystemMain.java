package homework_24.PaymentSystem;
/*
Task 2
Платежные системы
Создайте интерфейс PaymentSystem с методами:
withdrawMoney(double amount) (снятие со счета) - списываются деньги со счета
depositTransfer(double amount) (поступление денег на счет);
checkBalance() (остаток на счете).
Напишите классы BankAccount и ElectronicWallet, которые реализуют данный интерфейс.
Банк предоставляет счета, например, в евро, а электронный кошелек в другой валюте
Убедитесь, что каждый класс корректно выполняет каждую из операций.
Опционально
Добавить в интерфейс метод:

transferMoney() (перевод средств на другой счет) - Средства списываются с одного счета и зачисляются на другой счет
Должна быть возможность осуществлять переводы между этими классами. Т.е. возможность перевода средств:
Банк -> Банк
Банк -> Кошелек
Кошелек -> Кошелек
Кошелек -> Банк
 */

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
