package lesson2;

import java.util.Scanner;

public class degree2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число для подсчета формулы: ");
        int x = scanner.nextInt();
        int formula = x * x;
        System.out.println(formula);
    }
}
