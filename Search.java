package tranphamtuankiet_;
import java.util.ArrayList;
public class Search {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("C++");
        keywords.add("Python");
        keywords.add("Java");
        keywords.add("JavaScript");
        if (keywords.contains("Python")) {
            System.out.println("Python is in the list.");
        } else {
            System.out.println("Python is not in the list.");
        }
    }
}