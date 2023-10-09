package mingguke6;

import java.util.Scanner;

public class soalno3percobaan3 {
    public static void main(String[] args) {
        Scanner input28=new Scanner(System.in);
        String kategori;
        int penghasilan, gajibersih;
        double pajak = 0;
        System.out.print("masukan kategori : ");
        kategori = input28.nextLine();
        System.out.print("masukan besarnya penghasilan : ");
        penghasilan = input28.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else 
            pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasilan bersih : " + gajibersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 350000)
            pajak = 0.25;
            gajibersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasil bersih : " + gajibersih);

        } else 
        System.out.println("masukkan kategori salah");

    }
}
