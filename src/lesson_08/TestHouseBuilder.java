package lesson_08;

public class TestHouseBuilder {

    public static void main(String[] args) {
        HouseWithBuilder.Builder builder = new HouseWithBuilder.Builder();
        HouseWithBuilder house = builder.setDoorNum(2)
                .setTopRoofColor("Dark Blue")
                .setColor("Green")
                .build();

        System.out.println(house);
    }
}
