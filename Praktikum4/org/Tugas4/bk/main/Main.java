package bk.main;

import bk.bukuFiksi.bukuNovel;
import bk.bukuNonFiksi.bukuAkademik;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBuku Novel");
        bukuNovel g = new bukuNovel("Tujuh Ksatria dan Putri Berwajah Teduh", "Nita Ar-Rumaisha", "2016", "Comedy", 350, 60000);
        g.view();
        System.out.println("\nBuku Akademik");
        bukuAkademik j = new bukuAkademik("Anatomi Tubuh", "dr.Kyy", "2027", "Kedokteran", 2004, 1500000);
        j.view();
    }
    
}
