public class MainForString {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        char symbol = stringUtils.getFirstSymbol("Привет");

        System.out.println(symbol);

        char a = stringUtils.getLastSymbol("Привет");

        System.out.println(a);

    }
}
