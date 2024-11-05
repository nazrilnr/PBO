package Jobsheet3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
            System.out.println("Meminjam uang " + jumlah + "...");
        }
    }

    public void angsur(double jumlah) {
        if (jumlah <= jumlahPinjaman) {
            jumlahPinjaman -= jumlah;
            System.out.println("Membayar angsuran " + jumlah);
        } else {
            System.out.println("Angsuran melebihi jumlah pinjaman.");
        }
    }
}