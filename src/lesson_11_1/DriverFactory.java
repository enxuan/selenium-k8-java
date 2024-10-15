package lesson_11_1;

public class DriverFactory {

    public static void initAppiumDriver(Platform platform) {
        switch (platform) {
            case ANDROID:
                System.out.println("Init Android driver");
                break;
            case IOS:
                System.out.println("init IOS driver");
                break;
            default:
                throw new IllegalArgumentException("Plz provide correct platform");
        }
    }
}
