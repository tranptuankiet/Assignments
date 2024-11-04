package tranphamtuankiet_;
import java.util.Scanner;
public class timsonguyento {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to tu 1-100: ");
        for (int n = 1; n <= 100; n++) {
            boolean songuyento = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    songuyento = false;
                    break;

                }
                if (songuyento) {
                    System.out.print(n + " ");
                }
            }
        }
    }
}