package Jobsheet6;

public class PerangkatElektronik {
    private String merk;
    private String mode;
    private int tahunProduksi;

    public PerangkatElektronik() {
        this.merk = "Unknown";
        this.mode = "Unknown";
        this.tahunProduksi = 0;
    }

    public PerangkatElektronik(String merk, String mode, int tahunProduksi) {
        this.merk = merk;
        this.mode = mode;
        this.tahunProduksi = tahunProduksi;
    }

    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Mode: " + mode);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public String getMerk() {
        return merk;
    }

    public String getMode() {
        return mode;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    //Modif
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
}
