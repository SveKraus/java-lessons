package homework4;

import java.util.Scanner;

public class Summa {

        public  Summa(){
            System.out.print("Ведди первое число:");
            Scanner first = new Scanner(System.in);
            String num = first.next();
            int intNum = Integer.parseInt(num);

            System.out.print("Введи второе число:");
            Scanner second = new Scanner(System.in);
            String num2 = first.next();
            int intNum2 = Integer.parseInt(num2);

            System.out.print("Введи третье число:");
            Scanner firstNum3 = new Scanner(System.in);
            String num3 = first.next();
            int intNum3 = Integer.parseInt(num3);

            int sumAllNum = intNum + intNum2 + intNum3;
            System.out.println("Результат:" + sumAllNum );
        }
}
