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

        float total = uas + uts + kuis + tugas;
        String message = total < 65 ? "remidi" : "tidak remidi";

        System.out.println("nilai akhir = " + total + " sehingga " + message);
        
        if (total >= 100) {
            System.out.println("kualifikasi nilai sangat baik dengan predikat 'A', nilai setara '4' ");
        } else if (total >=73) {
            System.out.println("kualifikasi nilai lebih dari baik dengan predikat 'B+', nilai setara '3.5' ");
        } else if (total >=63) {
            System.out.println("kualifikasi nilai baik dengan predikat 'B', nilai setara '3' ");
        } else if (total >=60) {
            System.out.println("kualifikasi nilai lebih dari cukup dengan predikat 'C+', nilai setara '2.5' ");
        } else if (total >=50) {
            System.out.println("kualifikasi nilai cukup dengan predikat 'C', nilai setara '2' ");
        } else if (total >=39) {
            System.out.println("kualifikasi nilai kurang dengan predikat 'D', nilai setara '1' ");
        } else if (total <=39) {
            System.out.println("kualifikasi nilai lebih dari kurang dengan predikat 'E', nilai setara '0' ");
        }
    }
}
