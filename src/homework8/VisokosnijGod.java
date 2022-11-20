package homework8;

import java.util.Scanner;

public class VisokosnijGod {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Введите год, начало отсчета");
        int FirstYear = one.nextInt();
        System.out.println("Введите год, конец отсчета");
        int SecondYear = one.nextInt();
        int x = (FirstYear - SecondYear)/4;
        System.out.println("Количество високосных лет: " +x);

    }
}
