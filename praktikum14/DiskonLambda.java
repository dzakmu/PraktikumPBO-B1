/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM : 24060122130064          */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3); 
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " +diskonMerdeka.hitungDiskon(45000));
        System.err.println("Diskon Lebaran: " +diskonLebaran.hitungDiskon(45000));
        System.out.println("DIskon Biasa: "   +diskonBiasa.hitungDiskon(45000));
    }
}
