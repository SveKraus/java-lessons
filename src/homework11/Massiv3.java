package homework11;

import java.util.Arrays;
import java.util.Random;

public class Massiv3 {
    public static void main(String[] args) {
        Random random = new Random();
        int fromHowTime = 8;
        int toTime = 20;
        int[] hours = new int[toTime - fromHowTime];
        for (int i = 0 ; i < toTime - fromHowTime; i++) {
            hours[i] = i + fromHowTime;
        }
        System.out.println( "Time:    " + Arrays.toString(hours));

        int[] temper = new int[toTime-fromHowTime];

        int firstTemp = random.nextInt(4)+5;
        int changesTemp = random.nextInt(2)+1;
        for (int i = 0; i < toTime-fromHowTime; i++){

            temper[i]=firstTemp-changesTemp;
            changesTemp++;

            if (temper[i]<0) {
                System.out.println("Через   " +i+ "часа(ов) была впервые отмечена отрицательная температура");
                break;
            }
        }
    }
}
