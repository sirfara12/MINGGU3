package mingguke11;
import java.util.Scanner;

public class square28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai N =");
        int N = sc.nextInt();

       // for(int i=1; i<=N; i++) {
          //  System.out.print("*");
        //}
        for (int iOuter=1; iOuter<=N; iOuter++) {
            for(int i=1; i<=N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

