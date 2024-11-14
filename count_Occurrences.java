package tranphamtuankiet_;
public class count_Occurrences {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("hello world", 'o'));
    }
} 
