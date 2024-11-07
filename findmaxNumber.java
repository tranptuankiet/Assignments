
package tranphamtuankiet_;
import java.util.Scanner;

public class findmaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("So luong phan tu phai lon hon 0.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Phan tu lon nhat trong mang: " + max);
        System.out.println("Phan tu nho nhat trong mang: " + min);

        scanner.close();
    }
}

