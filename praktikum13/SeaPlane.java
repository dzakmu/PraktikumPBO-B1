/*Nama      : Muhammad Dzaky Mu'ammar    */
/*NIM       : 24060122130064             */
/*Nama File : SeaPlane.java              */
/*Tanggal   : 3 Juni 2024                */

public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane (double maxLoad){
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
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }

    public SeaPlane(){
        this.maxLoad = 50;
    }
    
}
