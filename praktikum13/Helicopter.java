/*Nama      : Muhammad Dzaky Mu'ammar    */
/*NIM       : 24060122130064             */
/*Nama File : Helicopter.java            */
/*Tanggal   : 3 Juni 2024                */

public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter (double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficiency(){
        return 0;
    }

    public double calcTripDistance(){
        return 0;
    }

    @Override
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }

    public Helicopter(){
        this.maxLoad = 5;
    }
}
