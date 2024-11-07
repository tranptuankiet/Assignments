package tranphamtuankiet_;
import java.util.Scanner;

public class SumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("So luong phan tu phai lon hon 0.");
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Tong cua cac phan tu trong mang: " + sum);
        System.out.println("Trung binh cua cac phan tu trong mang: " + average);

        scanner.close();
    }
}