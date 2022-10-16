package homework5;

public class Pogoda {
    public static void main(String[] args) {
        boolean isSunny = true;
        boolean isWindy = false;
        boolean canSwim = isSunny && !isWindy;
        System.out.println(canSwim);

    }
}
