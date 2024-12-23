package InterfaceLatihan;

public class Kulkas extends AlatElektronik {
    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public String getInfo() {
        System.out.println("");
        return "Kulkas: Merk = " + getMerk() + ", Warna = " + getWarna() +
               ", Harga = " + getHarga() + ", Jumlah Pintu = " + jumlahPintu;
    }
}