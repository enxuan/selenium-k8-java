package lesson_09;

public class FTE extends Employee{

    private static int FTE_SALARY = 50000;

    public FTE(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return FTE_SALARY;
    }

    @Override
    public int getSupportMoney() {
        return 5000;
    }
}
