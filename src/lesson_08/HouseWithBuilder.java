package lesson_08;

public class HouseWithBuilder {
    private int doorNum = 1;
    private String topRoofColor = "red";
    private String color = "white";

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder) {
        color = builder.color;
        topRoofColor = builder.topRoofColor;
        doorNum = builder.doorNum;
    }

    // READ ONLY
    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "House {doorNum='" + doorNum +
                "', topRoofColor=" + topRoofColor +
                ", color=" + color + "}";
    }

    // Customer service | Inner class
    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "red";
        private String color = "white";

        // WRITE ONLY

        public Builder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseWithBuilder build() {
            return new HouseWithBuilder(this);
        }
    }
}
