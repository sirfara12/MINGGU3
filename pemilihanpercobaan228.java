package mingguke5;

import java.util.Scanner;

public class pemilihanpercobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("nilai uas     : ");
        float uas = input28.nextFloat();
        System.out.print("nilai uts    :  ");
        float uts = input28.nextFloat();
        System.out.print("nilai kuis    :  ");
        float kuis = input28.nextFloat();
        System.out.print("nilai tugas : ");
        float tugas = input28.nextFloat();

        float total = (uas * 0.4f) + (kuis * 0.1f) + (tugas * 0.2f);
        String message = total < 65 ? "remidi" : "tidak remidi";

        System.out.println("nilai akhir = " + total + " sehingga " + message);
        
    }
}
