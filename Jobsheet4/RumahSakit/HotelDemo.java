package RumahSakit;

import java.time.LocalDate;

public class HotelDemo {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Bintang Lima");

        Kamar kamar1 = new Kamar("101", "Deluxe");
        Kamar kamar2 = new Kamar("102", "Suite");

        Reservasi reservasi1 = new Reservasi("Andi", kamar1, LocalDate.of(2023, 9, 17));
        Reservasi reservasi2 = new Reservasi("Budi", kamar2, LocalDate.of(2024, 9, 18));

        hotel.tambahReservasi(reservasi1);
        hotel.tambahReservasi(reservasi2);

        System.out.println(hotel.getInfo());

        hotel.getDaftarReservasi();
    }
}
