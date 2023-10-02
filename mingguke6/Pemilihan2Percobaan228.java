package mingguke6;

import java.util.Scanner;

public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sudut1;
        int sudut2;
        int sudut3;
        int totalsudut;
        System.out.print("masukkan sudut1 segitiga");
        sudut1 = input.nextInt();
        System.out.print("masukkan sudut2 segitiga");
        sudut2 = input.nextInt();
        System.out.print("masukkan sudut3 segitiga");
        sudut3 = input.nextInt();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("segitiga tersebut adlah segitiga siku-siku");
            }else 
            System.out.println("segitiga tersebut adalah bukan segitiga siku-siku");

        } else 
           System.out.println("bukan segitiga");
        
    }
}
    