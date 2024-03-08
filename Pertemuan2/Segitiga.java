/*Nama: Muhammad Dzaky Mu'ammar */
/* NIM: 24060122130064 */

public class Segitiga{
        private double alas;
        private double tinggi;

    
        public Segitiga(double a, double t){
            alas = a;
            tinggi = t;
        }

        public double getAlas(){
            return alas;
        }

        public double getTinggi(){
            return tinggi;
        }

        public double hitungLuas(){
            return 0.5 * alas * tinggi;
        }
}