package lesson_07_1;

public class RobotDog {

    protected static int dogId = 0;
    private String name;
    private int robotId;

    public RobotDog() {
        dogId++;
        robotId = dogId;
    }

    public int getDogId() {
        return robotId;
    }

    public static void changeId() {
        dogId++;
    }
}
