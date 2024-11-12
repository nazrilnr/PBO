package InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek TV
        TV tv = new TV("LED", 50, 3000000, "Hitam", "Samsung");

        // Membuat objek SmartFridge
        SmartFridge smartFridge = new SmartFridge(10, 2, 5000000, "Putih", "LG");

        // Membuat objek Kipas
        Kipas kipas = new Kipas("Dinding", 150000, "Putih", "Miyako");

        // Membuat objek Kulkas
        Kulkas kulkas = new Kulkas(1, 2500000, "Silver", "Panasonic");

        // Menampilkan informasi dari setiap objek
        System.out.println(tv.getInfo());
        System.out.println(smartFridge.getInfo());
        System.out.println(kipas.getInfo());
        System.out.println(kulkas.getInfo());
    }
}
