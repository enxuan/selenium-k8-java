package lesson_10_3;

import java.util.Arrays;
import java.util.List;

public class RacingController {

    public void flyableRacing(List<IFlyable> flyableAnimals) {

    }

    public void nonFlyableRacing(List<MoveAble> nonFyableAnimals) {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Meo", 20);
        Eagle eagle = new Eagle("Eagle", 70);

        new RacingController().flyableRacing(Arrays.asList(eagle));
    }
}
