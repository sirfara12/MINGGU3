package jobsheet4;

import java.util.Scanner;

public class hargabayar28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        String merkbuku;
        double dis, total, bayar, jmldis;
        System.out.println("masukkan merk buku ");
        merkbuku=input.nextLine();
        System.out.println("masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("masukkan besaran diskon ");
        dis=input.nextDouble();
        
        total=harga*jumlah;
        jmldis=total*dis;
        bayar=total-jmldis;
        System.out.println("diskon yang anda dapatkan adalah " +(int)jmldis);
        System.out.println("jumlah yang harus dibayar adalah " +(int)bayar);
        
    }
}
