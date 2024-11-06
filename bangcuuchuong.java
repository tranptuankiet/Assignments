package tranphamtuankiet_;
import java.util.Scanner;
public class bangcuuchuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so de tao bang cuu chuong: ");
        int number = scanner.nextInt();

        System.out.println("Bang cuu chuong cua " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}
