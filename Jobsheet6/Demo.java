package Jobsheet6;

public class Demo {
    public static void main(String[] args) {
        System.out.println("");
        TV tv = new TV("Samsung", "Model A", 2022, 55);
        System.out.println("TV Information:");
        System.out.println("----------------");
        tv.displayInfoTV();
        
        //modif
        tv.setMerk("LG");
        tv.setMode("Model B");
        tv.setTahunProduksi(2023);
        tv.setUkuranLayar(65);
        
        System.out.println("\nAfter modification:");
        tv.displayInfoTV();

        System.out.println();

        Tablet tablet = new Tablet("Apple", "iPad", 2021, 5000);
        System.out.println("Tablet Information:");
        System.out.println("--------------------");
        tablet.displayInfoTablet();
        System.out.println("");

        //modif
        tablet.setMerk("Samsung");
        tablet.setMode("Galaxy Tab");
        tablet.setTahunProduksi(2022);
        tablet.setKapasitasBaterai(8000);
        
        System.out.println("\nAfter modification:");
        tablet.displayInfoTablet();
    }
}
