package homework10;

import java.util.Scanner;

public class Deliteli {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число промежутка (м):  ");
        int m = scan.nextInt();
        System.out.println("Введите второе число промежутка (n):  ");
        int n = scan.nextInt();

        int div=1;
        for (int i = m; i <=n; i++) {
            for (int x = div; x <=n/2; x++) {
                if (i==x || i<x){
                    break;
                }
                if (i%x==0 && div<x){
                    div=x;
                    System.out.println(div);
                }
            }
        }
    }
}
