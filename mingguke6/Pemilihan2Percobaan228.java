package mingguke6;

import java.util.Scanner;

public class Pemilihan2Percobaan228 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int sudut1;
        int sudut2;
        int sudut3;
        int totalsudut;

        System.out.print("masukkan sudut1 : ");
        sudut1 = input28.nextInt();
        System.out.print("masukkan sudut2 :");
        sudut2 = input28.nextInt();
        System.out.print("masukkan sudut3 :");
        sudut3 = input28.nextInt();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
            System.out.println("segitiga tersebut adlah segitiga siku-siku");
            }else if (sudut1==sudut2 && sudut1==sudut3 && sudut2==sudut3 && sudut3==sudut1){
                System.out.println("segitiga tersebut adalah segitiga sama sisi");
            }else if (sudut1==sudut2 || sudut1==sudut3 || sudut2==sudut3|| sudut3==sudut1){
                System.out.println("segitiga tersebut adalah sama kaki");
            }else {
                System.out.println("segitiga sembarang");
            }

        } else 
           System.out.println("bukan segitiga");
        
    }
}
    