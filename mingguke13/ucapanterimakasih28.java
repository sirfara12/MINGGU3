package mingguke13;

import java.util.Scanner;

public class ucapanterimakasih28 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
        
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("thank you"+nama+" for being the best teacher in the world.\n"+
        "you inspired in me a love for learning and made me feel like i cloud ask you anything.");
        
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println(tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("may you always be succesfull and happy");
    }

}
