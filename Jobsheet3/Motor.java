package Jobsheet3;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);
        
        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }
        
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("=========================");
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    // public void setKecepatan(int kecepatan) {
    //     if (isMesinOn && kecepatan >= 0 && kecepatan <= 100) {
    //         this.kecepatan = kecepatan;
    //     } else {
    //         System.out.println("Invalid speed. Speed must be between 0 and 100 and the engine must be on.");
    //     }
    // }    

    // public void setKecepatan(int kecepatan) {
    //     if (isMesinOn && kecepatan >= 0 && kecepatan <= 100) {
    //         this.kecepatan = kecepatan;
    //     } else {
    //         System.out.println("Invalid speed. Speed must be between 0 and 100 and the engine must be on.");
    //     }
    // }
    public void setKecepatan(int kecepatan) {
        if (isMesinOn && kecepatan >= 0 && kecepatan <= 100) {
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Kecepatan tidak valid. Kecepatan harus antara 0 dan 100 dan mesin harus dalam keadaan menyala.");
        }
    }
    
    
}
