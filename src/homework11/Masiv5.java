package homework11;

import java.util.Random;
import java.util.Scanner;

public class Masiv5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int max = 0;
        System.out.println("Введите количество элементов массива:  ");
        int n = scan.nextInt();
        int[] newMassiv = new int[n];
        for (int i = 0; i < newMassiv.length; i++) {
            newMassiv[i]=Math.abs(newMassiv[i]);
            if (max<newMassiv[i]){
                max=newMassiv[i];
            }
        }
        System.out.println("Максимальный по модулю элемент массива = " + max);
    }
}
