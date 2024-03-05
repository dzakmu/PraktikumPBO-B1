public class OperrasiTitik {
    public void refleksiSumbuX(Titik titik){
        titik.setOrdinat(-titik.getOrdinat());
    }
    public void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik refleksiX(Titik t){
        refleksiSumbuX(t);
        return t;
    }

    public Titik refleksiY(Titik t){
        refleksiSumbuY(t);
        return t;
    }
}
