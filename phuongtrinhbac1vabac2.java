package tranphamtuankiet_;
import java.util.Scanner;

public class phuongtrinhbac1vabac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Chon loai phuong trinh muon giai:");
        System.out.println("1. Phuong trinh bac 1 (ax + b = 0)");
        System.out.println("2. Phuong trinh bac 2 (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }
    }
    
    
    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("Giai phuong trinh bac 1: ax + b = 0");
        
        // Nhập hệ số a và b
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            // Tính nghiệm của phương trình
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }
    
   
    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Giai phuong trinh bac 2: ax^2 + bx + c = 0");
        
        
        System.out.print("Nhap he so a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap he so c: ");
        double c = scanner.nextDouble();
        
    
        if (a == 0) {
           
            System.out.println("a = 0, phuong trinh tro thanh bac 1.");
            solveLinearEquation(scanner);
        } else {
            
            double delta = b * b - 4 * a * c;
            
            if (delta > 0) {
             
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (delta == 0) {
             
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
             
                System.out.println("Phuong trinh vo nghiem trong tap so thuc.");
            }
        }
    }
}
