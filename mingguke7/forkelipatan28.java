package mingguke7;
import java.util.Scanner;
public class forkelipatan28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0;
        int counter = 0;

        System.out.print("masukan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();
    for (int i = 1; i <= 50; i++) {
        if (i % kelipatan == 0) {
            jumlah += i;
            counter++;
        }
    }
    System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("jumlah bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

    }
}
