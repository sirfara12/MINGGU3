package mingguke5;

import java.util.Scanner;

public class pemilihanpercobaan128 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = input28.nextInt();
if (angka % 4 == 0){
    System.out.println("angka "+angka+" bilangan genap");
}else{
    System.out.println("angka "+angka+" bilangan ganjil");
}
        


    }
}
