package projek;

import java.util.Scanner;

public class ketersediaanruang {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        //membuat input
        System.out.print("masukkan nama perwakilan : ");
        String namaperwakilan = Scanner.nextLine();
        System.out.print("masukkan nama ruangan : ");
        String ruangan = Scanner.nextLine();
        System.out.print("masukkan waktu (jam): ");
        int waktujam = (Scanner.nextInt());
        System.out.print("masukkan waktu (menit): ");
        int waktumenit = Scanner.nextInt();
        System.out.print("lama penggunaan ruangan(menit): ");
        int durasi = Scanner.nextInt();

        System.out.print("jumlah orang : ");
        int orang = Scanner.nextInt();
        boolean jumlahmaksimal = orang <= 30;

        // Deklarasi dan inisialisasi variabel-variabel di sini sesuai kebutuhan

        //perhitungan 
        int menitkeluar = waktumenit + durasi;
        int jam = waktujam + (menitkeluar / 60);
        int menit = menitkeluar % 60;

        // int menitkeluar = waktumenit + durasi;
        // int jam = (menitkeluar > 60) ? (waktujam + (menitkeluar / 60)) : waktujam;
        // int menit = (menitkeluar > 60) ? (menitkeluar % 60) : menitkeluar;

         //membuat printoutnya
         System.out.print("atas nama : " + namaperwakilan);
         System.out.print("\nmenggunakan ruangan : " + ruangan);
         System.out.print("\ndengan jumlah orang :" + orang + "/" + jumlahmaksimal);
         System.out.print("\nkalian masuk pada pukul: " + waktujam + ":" + waktumenit);
         System.out.print("\nkalian keluar pukul: " + jam + ":" + menit);
 
         Scanner.close();
    }
}
       