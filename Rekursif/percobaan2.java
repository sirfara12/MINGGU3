package Rekursif;
import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return(1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;

        System.out.print("bilangan yang dihitung");
        bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        pangkat = sc.nextInt();

        System.out.print(bilangan);
        for (int i = 1; i < pangkat; i++) {
            System.out.print(" x " + bilangan);
        }

    System.out.print(" x 1");
    System.out.print(" = " + hitungPangkat(bilangan, pangkat));

    sc.close();
    }
}
