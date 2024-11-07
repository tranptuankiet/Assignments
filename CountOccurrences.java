package tranphamtuankiet_;
import java.util.Scanner;

public class CountOccurrences {

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

        System.out.print("Nhap phan tu can dem so lan xuat hien: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + target + " trong mang: " + count);

        scanner.close();
    }
}
