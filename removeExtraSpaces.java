package tranphamtuankiet_;
public class removeExtraSpaces {
     public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        System.out.println(removeExtraSpaces(" Hello   World "));  
    }
}
