package lesson_08;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative number");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative number");
        }
        this.age = age;
    }

    public void doSth() {
        name = "gfdf";
    }

    @Override
    public String toString() {
        return "Person {name='" + name +
                "', age=" + age + "}";
    }
}
