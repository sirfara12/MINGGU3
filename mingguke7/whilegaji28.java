package mingguke7;
import java.util.Scanner;
public class whilegaji28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahkaryawan;
        int jumlahjamlembur;
        double gajilembur = 0;
        double totalgajilembur = 0;
        String jabatan;

        System.out.print("masukkan jumlah karyawan: ");
        jumlahkaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahkaryawan) {
            System.out.println("pilihan jabatan -direktur, manajer, karyawan");
            System.out.print("masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("masukkan jumlah jam lembur: ");
            jumlahjamlembur = scan.nextInt();
           i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (jabatan.equalsIgnoreCase("manajer")) {
                gajilembur = jumlahjamlembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajilembur = jumlahjamlembur * 75000;
            } 
            totalgajilembur += gajilembur;
           
        }
         System.out.println("total gaji lembur: " + totalgajilembur);
    }
}
