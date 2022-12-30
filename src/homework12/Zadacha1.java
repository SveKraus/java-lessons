package homework12;

import java.util.Random;

public class Zadacha1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(3)+1;
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
        if (num==1){
            System.out.println("зима");
        }else if (num==2){
            System.out.println("весна");
        }else if (num==3){
            System.out.println("лето");
        }else {
            System.out.println("осень");
        }
    }
}
