package mingguke9;

import java.util.Scanner;

public class arraynilairatarata28 {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("masukkan jumlah mahasiswa : ");

        int n = sc.nextInt();
        
        int[] nilaimhs = new int[5];
        double totallulus = 0;
        double totaltidaklulus = 0;
        double rataratalulus = 0;
        double rata2tidaklulus;
        int jmltidaklulus = 0;
        int jmllulus = 0;

        
        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1)+" : ");
            nilaimhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaimhs.length; i++) {
           if (nilaimhs[i] > 70) {
            jmllulus++;
            totallulus += nilaimhs[i];
           } else {
            jmltidaklulus++;
            totaltidaklulus += nilaimhs[i];
           }
        } 
        
        rataratalulus = totallulus/ jmllulus;
        rata2tidaklulus = totaltidaklulus / jmltidaklulus;
        System.out.println("ratarata nilai lulus= " + rataratalulus);
        System.out.println("rata rata nilai tidak lulus  = " +rata2tidaklulus);
        
    }
   
}
