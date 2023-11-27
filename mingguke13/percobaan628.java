package mingguke13;
import java.util.Scanner;
public class percobaan628 {

    //fungsi main
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
        int p,l,t,L,vol;
        System.out.println("masukkan panjang");
        p=input.nextInt();
        System.out.println("masukkan lebar");
        l=input.nextInt();
        System.out.println("masukkan tinggi");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("luas persegi panjang adalah "+L);

        vol=hitungVolume(t, p, l);
        System.out.println("volume balok adalah "+vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int luas=pjg*lb;
        return luas;
    }
    static int hitungVolume (int tinggi, int a, int b) {
        int volume= hitungLuas(a,b)*tinggi;
        return volume;
    }
}

