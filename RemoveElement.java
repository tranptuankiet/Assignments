package tranphamtuankiet_;
import java.util.ArrayList;
public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5));
        System.out.println("Danh sach sau khi xoa 5: " + numbers);
    }
}