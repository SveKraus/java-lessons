package homework5;

import java.io.InputStream;

public record Scaner(InputStream in) {
    static boolean searchString(String str) {
        return str.length() > 10;
    }

    static boolean parted4For6(int x) {
        return x % 4 == 0 && x % 6 == 0;

    }
}
