package homework10;

public class VseChisla {
    public static void main(String[] args) {
        for (int i = 1000; i<=9999; i++){
            int duos = i/1000;
            int x = (i%1000)/100;
            int dec = (i%100)/10;
            int un = i%10;
            if (duos != x && duos!=dec && duos!= un && x != dec && x != un && dec !=un){
                System.out.println(i);
            }
        }
    }
}
