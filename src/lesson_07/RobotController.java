package lesson_07;

import java.util.Arrays;
import java.util.List;

public class RobotController {

    public static void main(String[] args) {
        RobotController robotController = new RobotController();
        RobotCat bateryRobotCat = new BatteryRobotCat("BateryRobotCat", "10/10/2020");
        RobotCat solarRobotCat = new SolarRobotCat("SolarRobotCat", "10/10/2020");
        RobotCat windRobotCat = new WindRobotCat("WindRobotCat", "10/10/2020");

        robotController.charge(Arrays.asList(bateryRobotCat, solarRobotCat, windRobotCat));
    }

    // Controller | IS-A relationship
    public void charge(List<RobotCat> robotCatList) {
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }
}
