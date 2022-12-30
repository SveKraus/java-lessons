package homework12;

import java.util.Random;

public class Zadacha3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(999)+1;
        System.out.println(num);

        int hangr = num / 100;
        int dec = (num% 100) / 10;
        int un = num % 10;
        int sum = hangr + dec + un;
        int multi = hangr * dec * un;

        System.out.println("Сумма цифр равна:  " +sum);
        System.out.println("Произведение цифр равна: " +multi);
    }
}
