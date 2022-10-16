package homework6;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean eagleOrTails = rand.nextBoolean();
        if (eagleOrTails) {
            System.out.println("Орел");
        } else {
            System.out.println("Решка");
        }
    }
}
