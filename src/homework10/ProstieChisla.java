package homework10;

import java.util.Scanner;

public class ProstieChisla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int howMuch = 0;
        for (int i = 1; howMuch>=0; i++){
            System.out.println("Введите целое число:  ");
            int num = scan.nextInt();
            if (num>2){
                System.out.println(howMuch+ "  простых чисел было введено");
                break;
            }
            howMuch=i;
        }
    }
}
