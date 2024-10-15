package lesson_12;

public class AndroidDriver extends AppiumDriver {

    @Override
    protected void initDriver() {
        System.out.println("Init Android driver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("close Android driver");
    }
}
