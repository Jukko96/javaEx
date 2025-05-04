package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("balance = " +bankAccount.getValance());
        bankAccount.withdraw(1000);
        bankAccount.deposit(10000);
        System.out.println("balance = " +bankAccount.getValance());
        bankAccount.withdraw(3000);
        System.out.println("balance = " +bankAccount.getValance());
    }
}
