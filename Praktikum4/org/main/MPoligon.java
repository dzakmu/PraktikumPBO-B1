package org.main;

import org.bangundatar.PersegiPanjang;
import org.bangundatar.Segitiga;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Peesegi Panjang : "+persegi.hitungLuas());
        
        Segitiga segitiga = new Segitiga(5, 20, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " +segitiga.hitungLuas());
    }
    
}
