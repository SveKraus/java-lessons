package homework4;

import java.util.Scanner;

public class Temperature {
        public Temperature(){
            System.out.println("Какая температура по Фаренгейту?:");
            Scanner temp = new Scanner(System.in);
            double tempPh = temp.nextDouble();
            double cels = (tempPh - 32.0) / 1.8;
            System.out.println("Температура по Цельсию :" + cels);
            System.out.println("Какая температура по Цельсию?:");
            Scanner temp2 = new Scanner(System.in);
            double tempCel = temp2.nextDouble();
            double phar = (tempCel * 1.8 + 32.0);
            System.out.println("Температура по Фаренгейту :" + phar);
        }
}
