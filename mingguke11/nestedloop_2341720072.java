package mingguke11;

import java.util.Scanner;

public class nestedloop_2341720072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[5][7];
        
        

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("hari ke-" + (j + 1) + ": ");
                temps[i] [j] = sc.nextInt();   
            } 
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i] [j] + " ");
            }
            System.out.println();
        }
    }
}
