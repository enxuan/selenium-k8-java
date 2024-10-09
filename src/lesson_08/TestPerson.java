package lesson_08;

public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("teo", 18);
        person.setAge(19);
        System.out.println(person);
        person.doSth();
    }

    // Builder Design Pattern

}
