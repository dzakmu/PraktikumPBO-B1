/*Nama      : Muhammad Dzaky Mu'ammar    */
/*NIM       : 24060122130064             */
/*Nama File : Vehicles.java              */
/*Tanggal   : 3 Juni 2024                */

public abstract class Vehicle{
    public double calcFuelEfficiency;

    public double calcTripDistance;

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}