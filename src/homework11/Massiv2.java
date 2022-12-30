package homework11;

import java.util.Arrays;
import java.util.Random;

public class Massiv2 {
    public static void main(String[] args) {
        int size = 100;
        int bound = 200;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i=0; i < size; i++){
            arr[i] = random.nextInt(bound);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * 2;
        }

    }
}
