package homework10;

import java.util.Scanner;

public class Treugolnik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту треугольника:  ");
        int hight = scan.nextInt();
        for (int i = 0; i <hight ; i++){
            for (int x =0; x < hight; x++){
                System.out.println("");
            }
            for (int x = 0; x < i*2 -1; x++){
                System.out.println("^");
            }
            System.out.println("");
        }

    }
}
