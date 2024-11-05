package Jobsheet7;

public class MainTaks1 {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        int sudutTersisa1 = segitiga.totalSudut(60);
        System.out.println("Sisa sudut dengan sudut A = 60°: " + sudutTersisa1 + "°");

        int sudutTersisa2 = segitiga.totalSudut(50, 60);
        System.out.println("Sisa sudut dengan sudut A = 50° dan sudut B = 60°: " + sudutTersisa2 + "°");

        int keliling1 = segitiga.keliling(3, 4, 5);
        System.out.println("Keliling segitiga dengan sisi 3, 4, 5: " + keliling1);

        double keliling2 = segitiga.keliling(3, 4);
        System.out.println("Panjang sisi miring segitiga siku-siku dengan sisi 3 dan 4: " + keliling2);
    }
}
