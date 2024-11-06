package tranphamtuankiet_;
import java.util.Scanner;
public class daysofibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day fibonacci: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Day fibonacci: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
