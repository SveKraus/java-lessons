package homework10;

public class PolnijKvadrat {
    public static void main(String[] args) {
        for (int i = 10; i <100; i++){
            int x = i+((i%10)*10)+(i/10);
            for (int y = 1; y < 100; y++){
                if (x==y*y){
                    System.out.println("Число "+i+" в сумме с числом, записанным теми же цифрами наоборот = "+x+" является полным квадратом по отношению к "+y);
                }
            }
        }
    }
}
