package Jobsheet7;

public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff[] staff; 

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff[] staff) {
        this.staff = staff; 
    }

    public void viewStaff() {
        if (staff != null) { 
            for (int i = 0; i < staff.length; i++) {
                staff[i].lihatInfo();
                System.out.println(); 
            }
        } else {
            System.out.println("No staff assigned.");
        }
    }

    public void lihatInfo() {
        System.out.println("Manager: " + this.getBagian());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Nama: " + this.getNama());
        System.out.println("Golongan: " + this.getGolongan());
        System.out.printf("Tunjangan: %.2f\n", this.getTunjangan());
        System.out.printf("Gaji: %.2f\n", this.getGaji()); // Use overridden getGaji
        System.out.println("Bagian: " + this.getBagian());
        this.viewStaff(); 
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
