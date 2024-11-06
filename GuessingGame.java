package tranphamtuankiet_;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
    Random random = new Random();
    int numberToGuess = random.nextInt(50) + 1;
    int userGuess = 0;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("chao ban den voi tro doan so! hay doan mot so tu 1 den 50");
    
    while (userGuess != numberToGuess) {
            System.out.print("Nhap so ban doan: ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("So cua ban thap hon.");
            } else if (userGuess > numberToGuess) {
                System.out.println("So cua ban cao hon.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so.");
            }
        }

        scanner.close();
    }
}
