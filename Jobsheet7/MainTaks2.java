package Jobsheet7;

public class MainTaks2 {
    public static void main(String[] args) {
        Manusia manusia;

        manusia = new Dosen();
        manusia.bernafas();  
        manusia.makan();    
        ((Dosen) manusia).lembur(); 

        System.out.println();

        manusia = new Mahasiswa();
        manusia.bernafas();  
        manusia.makan();     
        ((Mahasiswa) manusia).tidur(); 
    }
}
