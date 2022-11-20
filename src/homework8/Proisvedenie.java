package homework8;

public class Proisvedenie {
    public static void main(String[] args) {
        int proiz = 1;
        for (int i = 13; i <= 100; i=i+13) {
            if (i % 2!= 0) {
                proiz=proiz * i;
            }
        }
        System.out.println(proiz);
    }
}
