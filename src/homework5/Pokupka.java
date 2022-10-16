package homework5;

public class Pokupka {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду  "  +   canBuy);
    }

}
