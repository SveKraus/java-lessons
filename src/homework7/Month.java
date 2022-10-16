package homework7;

import java.util.Random;

public class Month {
    public static void main(String[] args) {
        Random x = new Random();
        int num = x.nextInt(11) +1;
        System.out.println(num);
        switch (num){
            case 12, 1, 2:
                System.out.println("зима");
                break;
            case 3, 4, 5:
                System.out.println("весна");
                break;
            case 6, 7, 8:
                System.out.println("лето");
                break;
            case 9, 10, 11:
                System.out.println("осень");
                break;
        }
    }
}
