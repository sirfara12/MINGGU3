package mingguke6;

import java.util.Scanner;

public class Pemilihan2Percobaan328 {
    public static void main(String[] args) {
         Scanner input28 = new Scanner(System.in);
         
         String kategori;
         int penghasilan, gajibersih;
         double pajak = 0;

         System.out.print("masukkan kategori : ");
         kategori = input28.next();
        System.out.print("masukkan besarnya penghasilan : "); 
        penghasilan = input28.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else pajak = 0.2;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasil bersih : " + gajibersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else 
            pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasil bersih : " + gajibersih);
        } else 
        System.out.println("masukkan kategori salah ");


     }
}
