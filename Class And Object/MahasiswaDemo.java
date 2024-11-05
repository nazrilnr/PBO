public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa16 m1 = new Mahasiswa16();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa16 m2 = new Mahasiswa16();
        m2.nim = "023433";
        m2.nama = "Nazreal";
        m2.alamat = "Probolinggo< Jawa Timur";
        m2.kelas = "2G";

        Mahasiswa16 m3 = new Mahasiswa16();
        m3.nim = "023434";
        m3.nama = "Ucup";
        m3.alamat = "Surabaya, Jawa Timur";
        m3.kelas = "2D";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }
}