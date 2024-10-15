package Strategy_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {

    Animal getWinner(List<Animal> animalList) {
        Animal winner = null;
        List<Animal> nonFlyableAnimals = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.flyAble()) {
                nonFlyableAnimals.add(animal);
            }
        }

        for (Animal animal : nonFlyableAnimals) {

        }
        return winner;
    }
}
