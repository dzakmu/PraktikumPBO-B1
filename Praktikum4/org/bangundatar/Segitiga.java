package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.tinggi = tinggi;
        this.alas = alas;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return 0.5*alas*tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga berisi : " + this.getJumlahSisi());
    }
    
}
