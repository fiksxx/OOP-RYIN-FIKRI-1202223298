import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1202223298", "Muhammad Zulfikri Mansur", 1000000.0);
        Account account2 = new Account("1202223233", "Ariel Christsando", 2000000.0);
        Account account3 = new Account("1202233498", "Abid Naufal Rafif", 3000000.0);
        Account account4 = new Account("1202233748", "Patricia Elga Jane", 7000000.0);
        Account account5 = new Account("1202233754", "Muhammad Azka Farhan", 9000000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        System.out.println("Saldo Akun "+ account1.getName() +": "+ account1.getBalance() + "\nSaldo Akun "+ account2.getName() +": "+ account2.getBalance() + "\nSaldo Akun "+ account3.getName() +": "+ account3.getBalance() +"\nSaldo Akun "+ account4.getName() +": "+ account4.getBalance() +"\nSaldo Akun "+ account5.getName() +": "+ account5.getBalance() +"\n");

        account1.deposit(500000.0);

        account2.withdraw(100000.0);

        bank.removeAccount(account2.getAccountNumber());

        List<Account> accounts = bank.getAllAccounts();
        System.out.println("\nDaftar semua akun dalam bank: ");
        for (Account account : accounts) {
            System.out.println("Nama: " + account.getName() + ", nomor akun: " + account.getAccountNumber() + ", Saldo: " + account.getBalance() + "");
        }
    }
}