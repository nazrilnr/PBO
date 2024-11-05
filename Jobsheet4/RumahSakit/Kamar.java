package RumahSakit;

public class Kamar {
    private String nomorKamar;
    private String tipeKamar;

    public Kamar(String nomorKamar, String tipeKamar) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
    }

    public String getInfo() {
        return nomorKamar + ", " + tipeKamar;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public String getTipeKamar() {
        return tipeKamar;
    }
}
