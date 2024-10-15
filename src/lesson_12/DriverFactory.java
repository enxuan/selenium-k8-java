package lesson_12;

import lesson_11_1.Platform;

public class DriverFactory {

    public static AppiumDriver getAppiumDriver(String platform) {
        AppiumDriver appiumDriver;
        switch (platform) {
            case "ANDROID":
                appiumDriver = new AndroidDriver();
                break;
            case "IOS":
                appiumDriver = new IOSDriver();
                break;
            default:
                throw new IllegalArgumentException("Plz provide correct platform");
        }
        return appiumDriver;
    }
}
