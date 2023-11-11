package mingguke11;
import java.util.Scanner;
import java.util.Random;
public class quiz28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do{
                System.out.print("tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer == number);

            }while(!success);
            System.out.print("apakah anda ingin mengulang permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        }while (menu=='y' || menu=='Y');
            
        }

    }
