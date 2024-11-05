package Jobsheet6;

public class Tablet extends PerangkatElektronik {
    private int kapasitasBaterai;

    public Tablet() {
        super();
        this.kapasitasBaterai = 0;
    }

    public Tablet(String merk, String mode, int tahunProduksi, int kapasitasBaterai) {
        super(merk, mode, tahunProduksi);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public void displayInfoTablet() {
        displayInfo();
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }

    //modif
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }
}
