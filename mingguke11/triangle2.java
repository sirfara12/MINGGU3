package mingguke11;
import java.util.Scanner;
public class triangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai N =");
        int N =sc.nextInt();
        int i = 1;
        while (i<= N) {
            int j = 1;
            while (j<= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
