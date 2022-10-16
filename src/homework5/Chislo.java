package homework5;

import java.util.Scanner;

public class Chislo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:  ");
        int num1 = scan.nextInt();
        System.out.println(parted4For6(num1));




    }
    static boolean parted4For6(int num1) {
        return num1 % 6 ==0 && num1 % 4 == 0; //число которое делится на 6 и на 4

    }


    }

