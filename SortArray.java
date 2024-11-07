package tranphamtuankiet_;
import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

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

        Arrays.sort(arr);

        System.out.println("Mang sau khi sap xep theo thu tu tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
