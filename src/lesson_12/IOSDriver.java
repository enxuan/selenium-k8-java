package lesson_12;

public class IOSDriver extends AppiumDriver {

    @Override
    protected void initDriver() {

        System.out.println("Init IOS driver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("Close IOS driver");
    }
}
