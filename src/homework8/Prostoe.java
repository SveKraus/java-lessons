package homework8;

import java.util.Scanner;

public class Prostoe {
    private static int i;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){

            }
        }
        if (sum == 2) {
            System.out.print(num + " простое число");
        }else{
            System.out.print(num+ " непростое число");
        }
    }
}
