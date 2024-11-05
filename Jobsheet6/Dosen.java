package Jobsheet6;

public class Dosen extends Pegawai {
    public String nidn;

    // public Dosen() {
    //     System.out.println("Objek dari class Dosen dibuat");
    // }

    // public String getAllInfo(){
    //     String info = "";
    //     info += "NIP    : " + super.nip + "\n";
    //     info += "Nama   : " + super.nama + "\n";
    //     info += "Gaji   : " + super.gaji + "\n";
    //     info += "NIDN   : " + this.nidn + "\n";
        
    //     return info;
    // }

    // public String getAllInfo(){
    //     String info = getInfo();
    //     info += "NIDN   : " + nidn;

    //     return info;
    // }

    public String getAllInfo(){
        String info = super.getInfo();
        info += "NIDN   : " + nidn;

        return info;
    }

    public String getInfo(){
        return "NIDN    : " + this.nidn + "\n";
    }

    // public Dosen(String nip, String nama, double gaji, String nidn) {
    //     super();
    //     super.nip = nip;
    //     super.nama = nama;
    //     super.gaji = gaji;
    //     this.nidn = nidn;
    // }
    
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji); 
        this.nidn = nidn;
    }
}