package homework10;

import java.util.Scanner;

public class DomashneeZadanie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "Я всегда делаю домашнее задание";
        String exchange = str.replace('а','А');
        System.out.println(exchange);
    }
}
