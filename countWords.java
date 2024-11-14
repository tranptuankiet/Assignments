package tranphamtuankiet_;
public class countWords {
     public static int countWords(String str) {
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is fun")); 
    }
}
