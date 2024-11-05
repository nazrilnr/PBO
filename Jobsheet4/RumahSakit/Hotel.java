package RumahSakit;

import java.util.ArrayList;

public class Hotel {
    private String namaHotel;
    private ArrayList<Reservasi> daftarReservasi;

    public Hotel(String namaHotel) {
        this.namaHotel = namaHotel;
        this.daftarReservasi = new ArrayList<>();
    }

    public void tambahReservasi(Reservasi reservasi) {
        daftarReservasi.add(reservasi);
        System.out.println("--- Reservasi Ditambahkan ---");
        System.out.println(reservasi.getInfo());
        System.out.println();
    }

    public void getDaftarReservasi() {
        System.out.println("--- Daftar Reservasi ---");
        int count = 1;
        for (Reservasi reservasi : daftarReservasi) {
            System.out.println(count + ". " + reservasi.getInfoFormatted());
            count++;
        }
    }

    public String getInfo() {
        return "--- Informasi Hotel ---\nNama Hotel: " + namaHotel + "\nTotal Reservasi: " + daftarReservasi.size() + "\n";
    }
}
