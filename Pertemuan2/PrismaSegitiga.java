/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolume(){
        return (alas.hitungLuas() *tinggiPrisma);
    }

    public double hitungluasPermukaan(){
        /*Asumsi Alas Segitiga Siku-Siku */
        double sisiMiring = Math.sqrt(alas.getAlas()*alas.getAlas() + alas.getTinggi()*alas.getTinggi());
        return ((2 * alas.hitungLuas()) + (sisiMiring * tinggiPrisma) + (alas.getTinggi() * tinggiPrisma) + (alas.getAlas() * tinggiPrisma));
    }    
} 