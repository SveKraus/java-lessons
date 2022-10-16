package homework7;

import java.util.Scanner;

public class Podezd {
    public static void main(String[] args) {
        System.out.print("Введите номер квартиры: ");
        Scanner scan = new Scanner(System.in);
        int numOfFlat = scan.nextInt();
        if (numOfFlat<21 && numOfFlat>0) {
            System.out.print("квартира находится в 1-ом подъезде");
        }else if (numOfFlat<49 && numOfFlat>20){
            System.out.print("квартира находится в 2-ом подъезде");
        }else if (numOfFlat<91 && numOfFlat>48){
            System.out.print("квартира находится в 3-eм подъезде");
        }else System.out.print("квартиры не существует в этом доме");
    }
}
