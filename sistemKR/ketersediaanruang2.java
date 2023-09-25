package sistemKR;
import java.util.Scanner;

public class ketersediaanruang2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama perwakilan: ");
        String namaperwakilan = scanner.nextLine();

        System.out.print("masukkan waktu masuk (jam): ");
        int waktumasuk = scanner.nextInt();

        System.out.print("masukkan durasi dalam ruangan (menit): ");
        int durasi = scanner.nextInt();

        System.out.print("masukkan jumlah murit: ");
        int jumlahmurit = scanner.nextInt();

        System.out.print("masukkan kapasitas ruangan: ");
        int kapasitasruangan = scanner.nextInt();

        System.out.print("masukkan waktu keluar(jam): ");
        int waktukeluar = scanner.nextInt();

        int waktuselesai = waktumasuk + durasi;

        boolean ruangandigunakan = (jumlahmurit <= kapasitasruangan) && (waktuselesai <= waktukeluar);

        System.out.println("nama perwakilan: " + namaperwakilan);
        System.out.println("jam selesai: " + waktuselesai);
        System.out.println("kapasitas ruangan: " + kapasitasruangan);
        System.out.println("ruangan sedang digunakan: " + (ruangandigunakan ? "ya" : "tidak"));

    }
}
