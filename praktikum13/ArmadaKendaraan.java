/*Nama      : Muhammad Dzaky Mu'ammar    */
/*NIM       : 24060122130064             */
/*Nama File : ArmadaKendaraan.java       */
/*Tanggal   : 3 Juni 2024                */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan <T extends Vehicle> {
    private List<T> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends T> kendaraanCollection) {
        armada.addAll(kendaraanCollection);
    }

    public List<T> getAllArmada() {
        return new ArrayList<>(armada);
    }
}
