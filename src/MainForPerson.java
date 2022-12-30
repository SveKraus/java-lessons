public class MainForPerson {

    public static void main(String[] args) {
        Person person = new Person("Даниил");
        Person secondPerson = new Person("Андрей");

        person.name = "Даниил";
        secondPerson.name = "Андрей";

        person.president = "Билл Клинтон";
        secondPerson.president = "Джорш Буш";

        System.out.println(person.name);
        System.out.println(secondPerson.president);

        System.out.println(person.president);
        System.out.println(secondPerson.president);

        Person thirdPerson = new Person("Павел");

        thirdPerson.name = "Павел";

        thirdPerson.info();
        secondPerson.info();
        person.info();


        Person.infoAboutClass();


        int a = Math.min(4,5);




    }
}
