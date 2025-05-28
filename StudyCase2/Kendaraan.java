package StudyCase2;
public class Kendaraan{
    String platNomor, tipe, merk;

    public Kendaraan(){

    }
    public Kendaraan(String platNomor, String tipe, String merk){
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    void print(){
        System.out.println(platNomor + " - " + tipe + " - " +merk);
    }
}