package homework5;

import java.util.Scanner;

public class Dlina {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String str = string.next();
        System.out.println(searchString(str));

    }
    static boolean searchString(String str){
        return str.length() > 10;

    }
}
