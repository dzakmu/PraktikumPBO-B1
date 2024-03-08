/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

public class BankAccount {
    private double balance;

    public BankAccount (double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit (double jumlah){
        if (jumlah > 0){
            this.balance += jumlah;
            System.out.println("Deposit Sejumlah " + jumlah + ". " + "Saldo Saat Ini: " + getBalance());
        }else{
            System.out.println("Deposit Harus Lebih Dari 0");
        }
    }

    public void withdraw (double jumlah){
        if (jumlah > 0 && jumlah <= this.balance){
            this.balance -= jumlah;
            System.out.println("Penarikan Sejumlah " + jumlah +  ". " + "Saldo Saat Ini: " + getBalance());
        }else{
            System.out.println("Saldo Tidak Cukup");
        }
    }

    public double getBalance(){
        return this.balance;
    }
    
}
