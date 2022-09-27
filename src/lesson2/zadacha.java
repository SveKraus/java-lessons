package lesson2;

import java.util.Scanner;

public class zadacha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int TovarA = 1000;
        int TovarB = 500;
        int Discount = 100;
        int price;
        price = TovarA + TovarB;
        price = price - Discount;
        System.out.println("стоимость Вашей покупки" + price + "рублей");
        System.out.println("Ваша скидка" +  Discount + "рублей");


    }
}
