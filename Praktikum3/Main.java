/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi menu
        Menu menu1 = new Menu("Nasi Goreng", 25000, 10);
        Menu menu2 = new Menu("Mie Ayam", 20000, 15);

        Scanner scanner = new Scanner(System.in);

        // Interaksi dengan pengguna
        System.out.println("Menu:");
        System.out.println("1. Nasi Goreng - Rp25000");
        System.out.println("2. Mie Ayam - Rp20000");

        try {
            // Meminta input dari pengguna
            System.out.print("Pilih menu (1/2): ");
            int pilihanMenu = scanner.nextInt();

            // Menentukan menu yang dipilih
            Menu menu = null;
            if (pilihanMenu == 1) {
                // TO DO 3: Tetapkan menu yang dipilih ke menu1 
                menu = menu1; 
            } else if (pilihanMenu == 2) {
                // TO DO 4: Tetapkan menu yang dipilih ke menu2 
                menu = menu2;
            } else {
                // TO DO 5: Tampilkan pesan bahwa menu tidak valid dan menghentikan eksekusi program
                System.out.println("Menu Tidak Valid");
            }
            
            // TO DO 6: Periksa apakah menu yang dipilih tidak null, jika null, seharusnya menimbulkan (throw) MenuTidakTersediaException
            if (menu == null){
                throw new MenuTidakTersediaException("Menu Tidak Tersedia"); 
            }

            System.out.print("Jumlah pesanan: ");
            int jumlahPesanan = scanner.nextInt();
            
            // Memeriksa apakah stok mencukupi
            // TO DO 7: Seharusnya menimbulkan (throw) JumlahPesananMelebihiStokException jika jumlah pesanan melebihi stok yang tersedia
            if (jumlahPesanan > menu.getStok()){
                throw new JumlahPesananMelebihiStokException();
            }

            // Melakukan pemesanan
            if (jumlahPesanan > 0){
                Pesanan pesanan = new Pesanan(menu, jumlahPesanan);
                menu.kurangiStok(jumlahPesanan);
    
                System.out.println("Pesanan berhasil dilakukan.");
                System.out.println("Total harga: Rp" + pesanan.getTotal());
            }else{
                System.out.println("Jumlah Pesanan Harus Lebih Dari 0");
            }

        } catch (MenuTidakTersediaException | JumlahPesananMelebihiStokException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
