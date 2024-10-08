package lesson_07;

// Sub-class, child class, concrete class
public class WindRobotCat extends RobotCat {

    public WindRobotCat() {

    }

    public WindRobotCat(String name, String productionDate) {
        super(name.concat("meomeomeo"), productionDate);
    }

    @Override
    public String charge() {
        return super.charge() + " with wind energy";
    }
}
