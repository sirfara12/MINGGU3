package mingguke11;
import java.util.Scanner;
public class tindividu2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("masukkan nilai N:");
        int N = sc.nextInt();

        for (int i = N; i >= 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
