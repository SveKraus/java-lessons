public class Person {

    String name;
    static String president;

    public Person(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Меня зовут " + name);
        System.out.println("Мой президент" +president);
    }

    public static void infoAboutClass() {
        System.out.println("Этот класс описывает человека и называется Person");

    }
}
