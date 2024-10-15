package Strategy_design_pattern;

public class TestDuck {

    void performQuackBehaviour(Duck duck) {
        duck.performQuack();
    }

    public static void main(String[] args) {
        // Test here
        Duck mallardDuck = new MallardDuck();
        Duck babyDuck = new BabyDuck();
        babyDuck.changeQuackBehaviour(new Quack());
        Duck decoyDuck = new DecoyDuck();

        TestDuck testDuck = new TestDuck();
        testDuck.performQuackBehaviour(mallardDuck);

        testDuck.performQuackBehaviour(babyDuck);
        testDuck.performQuackBehaviour(decoyDuck);
    }
}
