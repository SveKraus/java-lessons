package homework9;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int numfirst = scan.nextInt();
        System.out.println("Введите второе число:  ");
        int numSecond = scan.nextInt();
        int sum=0;
        for (int i = numfirst; i <=numSecond; i++) {
            if (i%2!=0)
                sum+=i;
        }
        System.out.println("Суммф нечетных чисел=  "+sum);
    }
}
