//file: BangunDatarGeneric.java
//package Generic;

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
/*Dengan mengubah T menjadi T1, kita telah menunjukkan bahwa 
identifikasi untuk parameter tipe generik dapat berupa identifikasi 
 valid apa pun, dan fungsionalitas kelas generik tetap tidak berubah. */

