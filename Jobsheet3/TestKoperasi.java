package Jobsheet3;

// public class TestKoperasi {
//     public static void main(String[] args) {
//         Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

//         System.out.println("Nama Anggota: " + anggota1.getNama());
//         System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

//         System.out.println("\nMeminjam uang 10.000.000...");
//         anggota1.pinjam(10000000);
//         System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

//         System.out.println("\nMeminjam uang 4.000.000...");
//         anggota1.pinjam(4000000);
//         System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

//         System.out.println("\nMembayar angsuran 1.000.000");
//         anggota1.angsur(1000000);
//         System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

//         System.out.println("\nMembayar angsuran 3.000.000");
//         anggota1.angsur(3000000);
//         System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
//     }
// }

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        // Mencoba mengangsur kurang dari 10%
        System.out.println("\nMembayar angsuran 300.000 (kurang dari 10%)");
        anggota1.angsur(300000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 400.000 (10% dari 4.000.000)");
        anggota1.angsur(400000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());
    }
}
