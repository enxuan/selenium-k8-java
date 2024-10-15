package lab.lab_08.lab07_2;

import java.util.Arrays;
import java.util.List;

public class TestLab07_2 {

    /* *
    * Credit: Nguyen Thinh Khang (Dev), in Selenium K1 for contributing the exercise.

        This is the first simple version racing contest problem.
        Racing animal simple version*
        Horse: Max 75 km/h
        Tiger: Max 100 Km/h
        Dog: Max 60 KM/h*
        Create an Animal class with a method speed() which return a random speeds
        Create 3 objects for those 3 animal type
        Run and see which animal is winner for racing
        Print result with format: Winner is <Animal name>, with speed: <speed>
        int randomSpeed = new SecureRandom().nextInt(50);
    * */

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        List<Animal> animalList = Arrays.asList(horse, tiger, dog);

        TestLab07_2 animalRacing = new TestLab07_2();
        Animal winner = animalRacing.findRacingWinner(animalList);
        System.out.println("Winner is " + winner.getClass().getSimpleName() + ", with speed: " + winner.getSpeed());

    }

    public Animal findRacingWinner(List<Animal> animalList) {

        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }

        return winner;
    }
}
