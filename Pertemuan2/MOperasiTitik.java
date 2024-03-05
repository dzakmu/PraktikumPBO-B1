public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4,4);
        Titik t2 =  new Titik(5,6);
        OperrasiTitik o = new OperrasiTitik();

        System.out.println("Titk(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiSumbuX(t);
        System.out.println("Titk(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiSumbuY(t);
        System.out.println("Titk(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiX(t2);
        System.out.println("Titk(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");

        o.refleksiY(t2);
        System.out.println("Titk(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        
    }    
}
