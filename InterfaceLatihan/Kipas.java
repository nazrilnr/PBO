package InterfaceLatihan;

public class Kipas extends AlatElektronik {
    private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
        
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getInfo() {
        System.out.println("");
        return "Kipas: Merk = " + getMerk() + ", Warna = " + getWarna() +
               ", Harga = " + getHarga() + ", Jenis = " + jenis;
    }
}