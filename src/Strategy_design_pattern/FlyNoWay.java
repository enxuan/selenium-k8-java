package Strategy_design_pattern;

public class FlyNoWay implements Flyable{
    @Override
    public boolean fly() {
        return false;
    }
}
