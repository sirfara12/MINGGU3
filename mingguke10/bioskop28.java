package mingguke10;

import java.util.Scanner;

import mingguke5.pemilihanpercobaan128;

public class bioskop28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] [] penonton = new String[4][2];

        penonton[0][0] = "amin";
        penonton[0][1] = "bena";
        penonton[1][0] = "candra";
        penonton[1][1] = "dela";
        penonton[2][0] = "eka";
        penonton[2][1] = "farhan";
        penonton[3][0] = "gisel";

        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

    }
}
