package RumahSakit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservasi {
    private String tamu;
    private Kamar kamar;
    private LocalDate tanggal;

    public Reservasi(String tamu, Kamar kamar, LocalDate tanggal) {
        this.tamu = tamu;
        this.kamar = kamar;
        this.tanggal = tanggal;
    }

    public String getInfo() {
        return "Tamu: " + tamu + "\nNomor Kamar: " + kamar.getInfo() + "\nTanggal: " + tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    public String getInfoFormatted() {
        return "Tamu: " + tamu +
                "\n   Nomor Kamar: " + kamar.getNomorKamar() +
                "\n   Tipe Kamar: " + kamar.getTipeKamar() +
                "\n   Tanggal: " + tanggal.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")) + "\n";
    }
}
