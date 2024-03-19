import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "Masukkan jejari lingkaran:  ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas Lingkaran dengan jejari " +jejari+ " satuan adalah " +l.hitungLuas());
        scan.close();
    }
}
