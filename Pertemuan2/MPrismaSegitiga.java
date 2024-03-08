/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga S1 = new Segitiga(3,4);
        PrismaSegitiga P1 = new PrismaSegitiga(S1, 5);

        System.out.println("Volume Prisma Segitiga Adalah " + P1.hitungVolume());
        System.out.println("Luas Permukaan Segitiga Adalah " + P1.hitungluasPermukaan());
    }
}
