package Jobsheet6;

public class TV extends PerangkatElektronik {
    private int ukuranLayar;

    public TV() {
        super();
        this.ukuranLayar = 0;
    }

    public TV(String merk, String mode, int tahunProduksi, int ukuranLayar) {
        super(merk, mode, tahunProduksi);
        this.ukuranLayar = ukuranLayar;
    }

    public void displayInfoTV() {
        displayInfo();
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }

    //modif
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }
}
