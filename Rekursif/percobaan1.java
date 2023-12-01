package Rekursif;

public class percobaan1 {
   static int faktorialRekursif(int n) {
    if (n ==0) {
      return (1);

    }else {
      return (n * faktorialRekursif(n - 1));
    }
   }

   static int faktorialLiteratif(int n) {
      int faktor = 1;
      for (int i =n; i >= 1; i--) {
         faktor = faktor * i;
      }
      return faktor;
   }

   public static void main(String[] args) {
      System.out.println("nilai faktorial Rekursif dari 5: " + faktorialRekursif(5));
      System.out.println("nilai faktorial Literatif dari 5: " + faktorialLiteratif(5));
   }
}
