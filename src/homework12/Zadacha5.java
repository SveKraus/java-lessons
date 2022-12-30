package homework12;

import java.util.Scanner;

public class Zadacha5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        int first = scan.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int second = scan.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int third = scan.nextInt();
        if (first + second >= third && second + third >= first && first + third >= second){
            System.out.println("Треугольник с такими сторонами существует");
        }else {
            System.out.println("Треугольник с такими сторонами не существует");
        }
    }
}
