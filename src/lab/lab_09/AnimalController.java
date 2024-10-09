package lab.lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public static void main(String[] args) {
        Animal meo = new Animal.Builder()
                .setName("meo")
                .setSpeed(new SecureRandom().nextInt(50))
                .setFlyable(false)
                .build();
        Animal eagle = new Animal.Builder()
                .setName("eagle")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(true)
                .build();
        Animal tiger = new Animal.Builder()
                .setName("tiger")
                .setSpeed(new SecureRandom().nextInt(100))
                .setFlyable(false)
                .build();
        Animal falcon = new Animal.Builder()
                .setName("falcon")
                .setSpeed(new SecureRandom().nextInt(30))
                .setFlyable(true)
                .build();
        Animal snake = new Animal.Builder()
                .setName("snake")
                .setSpeed(new SecureRandom().nextInt(10))
                .setFlyable(false)
                .build();

        List<Animal> animalRacingList = new ArrayList<>();
        animalRacingList.add(meo);
        animalRacingList.add(tiger);
        animalRacingList.add(eagle);
        animalRacingList.add(falcon);
        animalRacingList.add(snake);

        AnimalController animalController = new AnimalController();
        Animal winner = animalController.getRacingWinner(animalRacingList);
        if (winner == null) {
            System.out.println("no non-flyable animal join the racing");
        } else {
            System.out.println("The racing winner: " + winner);
        }
    }

    public Animal getRacingWinner(List<Animal> animalList) {
        Animal winner = null;
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                if (winner == null) {
                    winner = animal;
                } else if (animal.getSpeed() > winner.getSpeed()) {
                    winner = animal;
                }
            }
        }
        return winner;
    }
}
