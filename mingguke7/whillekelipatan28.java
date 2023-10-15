package mingguke7;
import java.util.Scanner;

public class whillekelipatan28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        int ratarata = 0;

        System.out.print("masukkan bilangan kelipatan (1-9) :");
        kelipatan = scan.nextInt();

        int i = 1;
        while (i <=50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                ratarata = jumlah/counter;
            }
            i++;
        }
        System.out.printf("banyak bilangan %d dari 1 sampai 50 adalah %d\n" , kelipatan, counter);
        System.out.printf("total bilangan kelipatan %d dari 1 samapai 50 adalah %d\n" , kelipatan, jumlah);
        System.out.printf("rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, ratarata);
    }
}
