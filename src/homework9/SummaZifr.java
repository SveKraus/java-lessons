package homework9;

import java.util.Scanner;

public class SummaZifr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите натуральное число:  ");
        int n = scan.nextInt();
        System.out.println("Сумма цифр равна:  " + sumDigits(n));
        }
        public static int sumDigits(int n){
        int sum=0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;


    }
}
