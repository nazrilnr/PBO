import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        PersegiPanjang16 persegi1 = new PersegiPanjang16();

        System.out.print("Masukkan panjang: ");
        persegi1.panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        persegi1.lebar = input.nextInt();

        System.out.println("");

        System.out.println("Luas Persegi Panjang   : " + persegi1.getLuas());
        System.out.println("Keliling Persegi Panjang: " + persegi1.getKeliling());

        input.close();
    }
}
