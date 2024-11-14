package tranphamtuankiet_;
import java.util.Arrays;
public class splitWords {

    public static String[] splitWords(String str) {
        return str.trim().split("\\s+");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitWords("Java is fun")));
    }
}