package homework6;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Cinema {
    public static void main(String[] args) {
        boolean decision = dressCode();
        if (decision){
            System.out.println("Можно смотреть фильм");
        }
        else
            System.out.println("Нельзя смотреть фильм");
    }

    static boolean dressCode() {
        System.out.println("Сколько тебе лет?");
        Scanner age = new Scanner(System.in);
        int ageOfHumans = age.nextInt();
        return ageOfHumans > 18;
    }
}
