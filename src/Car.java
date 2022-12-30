public class Car {
    //параметры

    String color;

    int number;

    boolean isSuperCar;

    public Car(String c, int n, boolean sc){
        color = c;
        number = n;
        isSuperCar = sc;
    }

    //поведение
    public void go(){
        if (isSuperCar) {
            System.out.println("Машина с номером " +number + " едет очень быстро");
        }
        else {
            System.out.println("Машина с номером " + number  + "  едет");
        }
    }

    public void info() {
        System.out.println("Это машина имеет цвет: " + color);
        if (isSuperCar) {
            System.out.println("Это машина быстрая");
        }
        System.out.println("Номер этой машины равен:  " + number);
    }
}
