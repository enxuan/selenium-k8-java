package lesson_07;

// Sub-class, child class, concrete class
public class SolarRobotCat extends RobotCat {

    public SolarRobotCat() {

    }

    public SolarRobotCat(String name, String productionDate) {
        super(name.concat("meomeomeo"), productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with solar energy";
    }
}
