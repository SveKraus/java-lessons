public class StringUtils {

    public static char getFirstSymbol(String string) {
        return string.charAt(0);
    }
    public static char getLastSymbol(String string) {
        int len = string.length();
        return string.charAt(len - 1);
    }
}
