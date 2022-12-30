package homework12;

import java.util.Arrays;

public class Zadacha8 {
    public static void main(String[] args) {
        int[] mass = {6,67,45,11,87,55,99,7,34,23,7,3,9,10};

        for (int i=0; i < mass.length; i++){
            System.out.println(mass[i]);
        }

        for (int i = 0; i < mass.length/2; i++) {
            int swapVal = mass[mass.length - i -1];
            mass[mass.length - i - 1] = mass[i];
            mass[i] = swapVal;
        }
        System.out.println(Arrays.toString(mass));

        int sum = 0;
        for (int i = 0; i < mass.length; i++){
            sum += mass[i];
        }
        System.out.println(sum);

        int even = 0;
        int uneven = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i]%2 == 0){
                even++;
            }else{
                uneven++;
            }
        }
        if (even > uneven){
            System.out.println("В массиве больше четных " +even+" : " +uneven);
        }else if (uneven > even){
            System.out.println("В массиве больше нечетных " +even+ " : " +uneven);
        }else {
            System.out.println("В массиве одинаковое количество четных и нечетных значений" +even+ " : "  +uneven);
        }
    }

}
