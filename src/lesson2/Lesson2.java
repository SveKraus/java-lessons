package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int dec = 637; // 6 * 100 + 3 * 10 + 7 * 1
        String convert = Integer.toBinaryString(dec);
        System.out.println(convert);


        System.out.println ("dec -> bin for 637: " );
        System.out.println(Integer.toBinaryString(dec));
        Integer.toBinaryString( 637);

        String binary = "1001111101";
        int i = Integer.parseInt(binary, 2);
        System.out.println(i);


    }
    }