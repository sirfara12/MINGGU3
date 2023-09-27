package mingguke5;

import java.util.Scanner;

public class pemilihanpercobaan328 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
         System.out.print("masukkan angka pertama: ");
         angka1 = input28.nextDouble();
         System.out.print("masukkan angka kedua: ");
         angka2 = input28.nextDouble();
         System.out.print("masukkan operator: ");
         operator = input28.next().charAt(0);

    switch (operator) {
        case '+':
        hasil = angka1 + angka2;
        System.out.print(angka1 + " + " + angka2 + "=" + hasil);
        break;
        case '-':
        hasil = angka1 - angka2;
        System.out.println(angka1 + " - " + angka2 + "=" + hasil);
        break;
        case '*':
        hasil = angka1 * angka2;
        System.out.println(angka1 + " * " + angka2 + "=" + hasil);
        break;
        case '/':
        hasil = angka1 / angka2;
        System.out.println(angka1 + " / " + angka2 + "=" + hasil);
        break;
    }

    }
}
 
