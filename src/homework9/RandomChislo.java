package homework9;

import java.util.Random;

public class RandomChislo {
    public static void main(String[] args) {
        Random random = new Random();
        int num= random.nextInt(900)+100;
        System.out.println(num);
        int maxNum = 0;
        for (int i =0; i<2; i++){
            int x = num % 10;
            if (maxNum<x){
                maxNum=x;
            }
            num=num/10;
        }
        System.out.println(maxNum);
    }
}
