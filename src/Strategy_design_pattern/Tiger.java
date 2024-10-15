package Strategy_design_pattern;

public class Tiger extends Animal{

    public Tiger() {
        flyable = new FlyNoWay();
    }
}
