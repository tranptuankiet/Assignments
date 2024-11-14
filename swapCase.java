package tranphamtuankiet_;
public class swapCase {
    public static String swapCase(String str) {
        StringBuilder swapped = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                swapped.append(Character.toLowerCase(ch));
            } else {
                swapped.append(Character.toUpperCase(ch));
            }
        }
        return swapped.toString();
    }

    public static void main(String[] args) {
        System.out.println(swapCase("Hello World"));  
    }
}
