package Rekursif;

import java.util.Scanner;

public class fibonanci {
    
    static int hitungjumlahmarmut(int bulan) {
        if (bulan <= 1) {
            return bulan;
        } else {
            int hasil = hitungjumlahmarmut(bulan - 1) + hitungjumlahmarmut(bulan - 2);
            return hasil;

        }
    }
    public static void main(String[] args) {
        int bulan;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bulan: ");
        bulan = input.nextInt();

        System.out.println("jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + hitungjumlahmarmut(bulan));
    }
}
