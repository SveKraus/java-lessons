package Homework3;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше Имя");
        String name = scan.next();
        System.out.println();
        System.out.println("Ваше имя начинается с буквы \n" + name.charAt(0));
    }
}
