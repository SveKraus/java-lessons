package lesson2;

public class Homework{
        public static void main(String[] args) {
            int dec = 637; // 6 * 100 + 3 * 10 + 7 * 1
            String convert = Integer.toHexString(dec);
            System.out.println(convert);


            System.out.println ("dec -> hex for 637: " );
            System.out.println(Integer.toHexString(dec));
            Integer.toHexString( 637);

            String hex = "27D";
            int i = Integer.parseInt(hex, 16);
            System.out.println(i);


        }
    }


