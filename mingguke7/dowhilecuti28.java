package mingguke7;
import java.util.Scanner;
public class dowhilecuti28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jatahcuti;
        int jumlahhari;
        String konfirmasi;

        System.out.print("jatah cuti: ");
        jatahcuti = sc.nextInt();

        do {
            System.out.print("apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc.nextLine();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari: ");
                jumlahhari = sc.nextInt();

                if (jumlahhari <= jatahcuti) {
                    jatahcuti -= jumlahhari;
                    System.out.println("sisa jatah cuti: " + jatahcuti);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahcuti > 0);
    }
}
