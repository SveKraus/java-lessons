package lesson2;

import java.util.Scanner;

public class Zadacha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tovarA = 1000;
        int tovarB = 500;
        int discount = 100;
        int price;
        price = tovarA + tovarB;
        price = price - discount;
        System.out.println("стоимость Вашей покупки" + price + "рублей");
        System.out.println("Ваша скидка" +  discount + "рублей");


    }
}
