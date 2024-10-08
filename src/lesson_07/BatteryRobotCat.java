package lesson_07;

// Sub-class, child class, concrete class
public class BatteryRobotCat extends RobotCat {

    public BatteryRobotCat() {

    }

    public BatteryRobotCat(String name, String productionDate) {
        super(name.concat("meomeomeo"), productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with battery";
    }
}
