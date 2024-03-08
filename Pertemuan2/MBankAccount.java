/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

public class MBankAccount {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount(1000);
        B1.deposit(500);
        B1.withdraw(200);
        System.out.println("Saldo Setelah Transaksi: " + B1.getBalance());
    }   
}
