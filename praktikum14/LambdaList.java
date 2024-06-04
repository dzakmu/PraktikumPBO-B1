/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM : 24060122130064          */

import java.util.ArrayList;


public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> System.err.println(nama));
        
    }
    
}
