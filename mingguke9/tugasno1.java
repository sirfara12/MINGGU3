package mingguke9;
import java.util.Scanner;
public class tugasno1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan banyaknya elemen:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.print("masukkan nilai tiap elemen:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        int max = array[0];
        int min = array[0];
        int sum = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            } 
            if (array[i] < min) {

            }
            sum += array[i];
        }
        double average = (double) sum / n;
        
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Rata-rata: " + average);
    }
}
