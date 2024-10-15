package lesson_11_1;

// Enum hoding value
public enum SupportIOSVersion {

    IOS_13("ios 13", 13),
    IOS_15("ios 15", 15),
    IOS_16("ios 16", 16);

    private String iosName;
    private int iosVersion;

    SupportIOSVersion(String iosName, int version){
        this.iosName = iosName;
        this.iosVersion = version;
    }

    public String getIosName() {
        return iosName;
    }

    public int getIosVersion() {
        return iosVersion;
    }
}
