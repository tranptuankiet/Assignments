package tranphamtuankiet_;
import java.util.ArrayList;
public class Traverse {
   public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Ho Chi Minh");
        cities.add("Da Nang");
        cities.add("Dong Ha");
        cities.add("Nha Trang");
        System.out.println("Danh sach cua thanh pho:");
        for (String city : cities) {
            System.out.println(city);
        }
    }  
}