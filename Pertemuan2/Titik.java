class Titik{
    // deklarasi atribut
    private double absis;
    private double ordinat;
    static int counterTitik;

    // deklarasi konstruktor
    public Titik(){
         absis = 0;
         ordinat = 0;
         counterTitik++;
    }

    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
   }

    // deklarasi metode 
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounter(){
        return counterTitik;
    }

    
}