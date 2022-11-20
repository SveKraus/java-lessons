package homework8;

import java.util.Scanner;

public class Tablizaumnoshenija {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый множитель:  ");
        int first = scan.nextInt();
        System.out.println("Введите второй множитель:  ");
        int second = scan.nextInt();
        System.out.println("Введите результат умножения:  ");
        int result = scan.nextInt();
        int answer = first * second;
        if (result == answer) {
            System.out.println("Ответ верный");
        }else {
            System.out.println( "Ответ неверный, правильный ответ:  " + answer);
        }

    }
}
