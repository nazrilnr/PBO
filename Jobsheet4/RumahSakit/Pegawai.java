package RumahSakit;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama =  nama;
    }

    public String getNip (String nip){
        return nip;
    }

    public void setNip(){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(){
        this.nama = nama;
    }

    public String getInfo(){
        return nama + " (" + nip + ")";
    }

}