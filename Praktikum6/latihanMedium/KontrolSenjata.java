/*Nama: Muhammad Dzaky Mu'ammar */
/*NIM: 24060122130064 */

public class KontrolSenjata{

    protected Senjata s;
    
    public KontrolSenjata(Senjata s){
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return s.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        s.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (s.getPeluru() == 0){
            System.out.println("Peluru Habis");
        }else{
            for(int i = 0; i < jumlah ; i++){
                if (s.getPeluru() > 0){
                    System.out.println(s.getBunyi());
                    s.setPeluru(s.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }           
            }
        System.out.println(">> Peluru sisa: " + s.getPeluru());
        }
    }
    
    public String menusuk(){
        if (s.isMenusuk()){
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        s.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
