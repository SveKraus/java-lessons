package homework7;

import java.util.Random;

public class Peremennaya {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(3) +1;
        System.out.println(num);
        switch (num){
            case 1:
                System.out.println("зима");
                break;
            case 2:
                System.out.println("весна");
                break;
            case 3:
                System.out.println("лето");
                break;
            case 4:
                System.out.println("осень");
                break;
        }
    }
}
