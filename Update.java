package tranphamtuankiet_;
import java.util.ArrayList;
public class Update {
     public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        numbers.set(2, 100);
        System.out.println("Danh sach cap nhat: " + numbers);
    }
}

