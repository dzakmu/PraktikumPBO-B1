/*Nama      : Muhammad Dzaky Mu'ammar    */
/*NIM       : 24060122130064             */
/*Nama File : Truck.java                 */
/*Tanggal   : 3 Juni 2024                */

public class Truck  extends Vehicle{
    private double maxLoad;

    public Truck (double maxLoad){
        this.maxLoad = maxLoad;
    }
    public double calcFuelEfficiency(){
        return this.maxLoad / 2;
    } 
    public double calcTripDistance(){
        return this.calcFuelEfficiency() * 2;
    }
    
    @Override
    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }

    public Truck(){
        this.maxLoad = 100;
    }
    
}
