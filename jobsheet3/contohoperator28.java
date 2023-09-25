package jobsheet3;

public class contohoperator28 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("setelahevaluasi, x = "+ x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println("setelahevaluasi, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.out.println("hasil x ^ hy adalah " + z);
        z %= 2;
        System.out.println("hasil akhir " +z);
    }
}

