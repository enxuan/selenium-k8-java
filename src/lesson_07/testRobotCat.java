package lesson_07;

public class testRobotCat {

    public static void main(String[] args) {
        RobotCat bateryRobotCat = new BatteryRobotCat("BateryRobotCat", "10/10/2020");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "10/10/2020");
        System.out.println(bateryRobotCat.charge());
        System.out.println(solarRobotCat.charge());
    }
}
