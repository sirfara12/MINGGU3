package mingguke10;

import java.util.Scanner;

public class bioskopwithscanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menuoption;
        String nama, next;

            String[][] penonton = new String[4][2];


            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Input data penonton");
                System.out.println("2. Tampilkan daftar penonton");
                System.out.println("3. Exit");
                System.out.print("Masukkan pilihan: ");
                menuoption = sc.nextInt();
                sc.nextLine();


                switch (menuoption) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama= sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                    } else {
                        System.out.println("kursi sudah ditempati. pilih kursi lain.");
                    }
                } else {
                    System.out.println("Nomor baris/kolom kursi tidak tersedia. ");
                }
                break;
            case 2:
            System.out.println("Daftar penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                         for (int j = 0; j < penonton[i].length; j++) {
                             if (penonton[i][j] != null) {
                                System.out.printf("%d-%d: %s\n", i+1, j+1, penonton[i][j]);
                             } else {
                                System.out.printf("%d-%d: ***\n", i + 1, j + 1);
                                }
                        }
                  }
            break;
            
               case 3:
                return;
            default:
                    System.out.println("Pilihan tidak valid.");
                }

            }
    }
}
