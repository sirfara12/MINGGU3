package mingguke13;
import java.util.Scanner;

import mingguke6.soalno3percobaan3;
public class kubus28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sisi;
        double luaspermukaan, volume;

        System.out.println("masukkan sisi");
        sisi = input.nextDouble();

        luaspermukaan = hitungLuasPermukaan(sisi);
        System.out.println("luas permukaan kubus" + luaspermukaan);

        volume = hitungVolume(sisi);
        System.out.println("volume kubus " + volume);
    }
    static double hitungLuasPermukaan (double sisi) {
        return 6 * Math.pow(sisi, 2);

    }
    static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }
}
