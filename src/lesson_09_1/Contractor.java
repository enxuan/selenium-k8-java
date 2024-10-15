package lesson_09_1;

public class Contractor extends Employee{
    public Contractor(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 40000;
    }

    @Override
    public int getSupportMoney() {
        return 0;
    }
}
