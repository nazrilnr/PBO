package Jobsheet1;

public class task1_Sepeda {

    public static void main(String[] args) {
        String model, model2, model3, model4, model5, model6, model7, model8, model9, model10;
        int cc1, cc2, cc3, cc4, cc5, cc6, cc7, cc8, cc9, cc10;
        int kecepatan, kecepatan2, kecepatan3, kecepatan4, kecepatan5, kecepatan6, kecepatan7, kecepatan8, kecepatan9, kecepatan10;

        model = "CBR150R";
        cc1 = 150;
        kecepatan = 120;

        model2 = "NMAX";
        cc2 = 155;
        kecepatan2 = 120;

        model3 = "Satria FU";
        cc3 = 147;
        kecepatan3 = 110;

        model4 = "Beat";
        cc4 = 140;
        kecepatan4 = 90;

        model5 = "Scopy";
        cc5 = 145;
        kecepatan5 = 100;

        model6 = "Vario";
        cc6 = 155;
        kecepatan6 = 100;

        model7 = "Fazio";
        cc7 = 140;
        kecepatan7 = 100;

        model8 = "AEROX";
        cc8 = 160;
        kecepatan8 = 120;

        model9 = "GSX-S150";
        cc9 = 165;
        kecepatan9 = 130;

        model10 = "GSX-R150";
        cc10 = 170;
        kecepatan10 = 120;

        kecepatan = upKecepatan(kecepatan, 10);
        kecepatan2 = downKecepatan(kecepatan2, 20);
        kecepatan3 = upKecepatan(kecepatan3,20);
        kecepatan4 = downKecepatan(kecepatan4,20);
        kecepatan5 = downKecepatan(kecepatan5, 30);
        kecepatan6 = upKecepatan(kecepatan6,20);
        kecepatan7 = downKecepatan(kecepatan7,20);
        kecepatan8 = upKecepatan(kecepatan8,20);
        kecepatan9 = upKecepatan(kecepatan9,10);
        kecepatan10 = downKecepatan(kecepatan10,20);

        System.out.println("");
        System.out.println("Model: " + model);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("CC: " + cc1);
        System.out.println("");
        System.out.println("Model 2: " + model2);
        System.out.println("Kecepatan 2: " + kecepatan2);
        System.out.println("CC 2: " + cc2);
        System.out.println();
        System.out.println("Model: " + model3);
        System.out.println("Kecepatan: " + kecepatan3);
        System.out.println("CC: " + cc3);
        System.out.println("");
        System.out.println("Model: " + model4);
        System.out.println("Kecepatan: " + kecepatan4);
        System.out.println("CC: " + cc4);
        System.out.println("");
        System.out.println("Model: " + model5);
        System.out.println("Kecepatan: " + kecepatan5);
        System.out.println("CC: " + cc5);
        System.out.println("");
        System.out.println("Model: " + model6);
        System.out.println("Kecepatan: " + kecepatan6);
        System.out.println("CC: " + cc6);
        System.out.println("");
        System.out.println("Model: " + model7);
        System.out.println("Kecepatan: " + kecepatan7);
        System.out.println("CC: " + cc7);
        System.out.println("");
        System.out.println("Model: " + model8);
        System.out.println("Kecepatan: " + kecepatan8);
        System.out.println("CC: " + cc8);
        System.out.println("");
        System.out.println("Model: " + model9);
        System.out.println("Kecepatan: " + kecepatan9);
        System.out.println("CC: " + cc9);
        System.out.println("");
        System.out.println("Model: " + model10);
        System.out.println("Kecepatan: " + kecepatan10);
        System.out.println("CC: " + cc10);
        System.out.println("");
    }

    public static int upKecepatan(int kecepatan, int up) {
        kecepatan += up;
        return kecepatan;
    }

    public static int downKecepatan(int kecepatan, int down) {
        kecepatan -= down;
        return kecepatan;
    }
}
