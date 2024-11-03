package tranphamtuankiet_;
import java.util.Scanner;

public class phuongtrinhbac1vabac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lựa chọn loại phương trình
        System.out.println("Chọn loại phương trình cần giải:");
        System.out.println("1. Phương trình bậc 1 (ax + b = 0)");
        System.out.println("2. Phương trình bậc 2 (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Giải phương trình bậc 1
            System.out.print("Nhập a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();

            giaiPhuongTrinhBac1(a, b);
        } else if (choice == 2) {
            // Giải phương trình bậc 2
            System.out.print("Nhập a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập c: ");
            double c = scanner.nextDouble();

            giaiPhuongTrinhBac2(a, b, c);
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    // Phương thức giải phương trình bậc 1 (ax + b = 0)
    public static void giaiPhuongTrinhBac1(double a, double b) {
        // Kiểm tra trường hợp a = 0
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Tính nghiệm x = -b / a khi a ≠ 0
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }

    // Phương thức giải phương trình bậc 2 (ax^2 + bx + c = 0)
    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        // Kiểm tra trường hợp a = 0, chuyển về phương trình bậc 1
        if (a == 0) {
            giaiPhuongTrinhBac1(b, c);
            return;
        }

        // Tính delta = b^2 - 4ac
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Nếu delta > 0, phương trình có 2 nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Nếu delta = 0, phương trình có nghiệm kép
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x = " + x);
        } else {
            // Nếu delta < 0, phương trình vô nghiệm
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
