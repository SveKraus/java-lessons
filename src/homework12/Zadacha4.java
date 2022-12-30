package homework12;

import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите фразу:  ");
        String myPhrase = scan.nextLine();
        System.out.println(myPhrase);
        int words = 0;
        if (myPhrase.length() != 0) {
            words++;
            for (int i = 0; i < myPhrase.length(); i++) {
                if (myPhrase.charAt(i) == ' ') {
                    words++;
                }

            }
        }
        System.out.println("Вы ввели "+words+ " слов(а)");

    }
}
