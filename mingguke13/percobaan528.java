package mingguke13;

public class percobaan528 {
    static void Tampil(String str, int... a){
        System.out.println("String: " + str);
        System.out.println("jumlah argumen/parameter: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    } 
    public static void main(String args[]) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("teknologi infrmasi", 1, 2, 3, 4, 5);
        Tampil("polinema");

    }
}
