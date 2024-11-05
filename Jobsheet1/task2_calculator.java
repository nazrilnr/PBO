package Jobsheet1;
import java.util.Scanner;
public class task2_calculator {

    public static void main(String[] args) {
        Scanner naz = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = naz.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = naz.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = naz.nextDouble();

        double hasil = 0;
        boolean validOperator = true;

        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = bagi(angka1, angka2);
                }
                break;
        }

        if (validOperator) {
            System.out.println("Hasil: " + hasil);
        }

        naz.close();
    }

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}
