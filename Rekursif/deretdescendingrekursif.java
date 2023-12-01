package Rekursif;
import java.util.Scanner;
public class deretdescendingrekursif {
         

    static void deretdescendingrekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretdescendingrekursif(n - 1);
        }
    }

    static void deretdescendingiteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("masukkan nilai n: ");
        n = sc.nextInt();

        System.out.print("deret rekursif: ");
        deretdescendingrekursif(n);
        System.out.println();

        System.out.print("deret iteratif: ");
        deretdescendingiteratif(n);

        sc.close();

    }
}
