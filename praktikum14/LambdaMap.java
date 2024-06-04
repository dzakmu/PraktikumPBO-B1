/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM : 24060122130064          */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat instance dari HashMap
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        // Menambahkan beberapa entri ke dalam map
        mahasiswaMap.put("123", "Adi");
        mahasiswaMap.put("456", "Bambang");
        mahasiswaMap.put("789", "Cici");
        mahasiswaMap.put("012", "Didi");

        // Menampilkan key dan value menggunakan ekspresi lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
