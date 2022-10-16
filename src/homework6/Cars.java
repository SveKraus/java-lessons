package homework6;

import java.util.Random;

public class Cars {
    public static void main(String[] args) {
        Random numberOfRegister = new Random();
        int registerNumber = numberOfRegister.nextInt(10000) + 1;
        System.out.println("Номер Вашего автомобиля: " + registerNumber);

        Random typeOfCar = new Random();
        boolean typeCar = typeOfCar.nextBoolean();
        if (typeCar){
            System.out.println("Ваш атомобиль не грузовик!") ;
        } else {
            System.out.println("Ваш автомобиль грузовик" );
        }

        if (typeCar && registerNumber%2==0){
            System.out.println("Пропускаем");
        } else if (typeCar && registerNumber%2!=0){
            System.out.println("Не пропускаем, не подхлдящий автомобиль");
        }
        else if ((registerNumber % 2 == 0) & (typeCar == false)){
            System.out.println("Не пропускаем, не подходщий автомобиль");
        }
        else {
            System.out.println("Не пропускаем, тип автомобиля и номера не подходящие");
        }
    }
}
