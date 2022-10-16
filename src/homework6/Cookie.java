package homework6;

import java.util.Scanner;

public class Cookie {
    public static void main(String[] args) {
        double priceForOne =0.5;
        System.out.print("Сколько ты хочешь печенья? ");
        Scanner numberOfCookie = new Scanner(System.in);
        int numberOfCookies = numberOfCookie.nextInt();

        System.out.print("Сколько у тебя денег? ");
        Scanner amountOfMoney = new Scanner(System.in);
        double amountOfMon = amountOfMoney.nextDouble();
        if (amountOfMon >= numberOfCookies * priceForOne){
            System.out.print("Можно");
        }else {
            System.out.print("Нельзя");
        }
    }
}
