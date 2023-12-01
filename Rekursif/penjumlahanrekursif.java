package Rekursif;
import java.util.Scanner;
public class penjumlahanrekursif { 
    public static int penjumlahanrekursif(int n, int f) {
        if (n == f) {
         return n;
         
        }else {
         return n + penjumlahanrekursif(n + 1, f);
    }

} 
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int f, i, n = 1, hasil;
    System.out.print("masukkan nilai f : ");
    f = sc.nextInt();

    System.out.print("hasil penjumlahan 1-" + f + ": ");
    for (i = 1; i <= f; i++) {
        System.out.print(i + " + ");
    }
    System.out.print(" : ");
    hasil = penjumlahanrekursif (n, f);
    System.out.print(hasil);
   }
}
