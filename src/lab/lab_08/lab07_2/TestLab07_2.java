package lab.lab_08.lab07_2;

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

        TestLab07_2 animalRacing = new TestLab07_2();
        Animal winner = animalRacing.findRacingWinner(horse, tiger, dog);
        System.out.println("Winner is " + winner.getClass().getSimpleName() + ", with speed: " + winner.getSpeed());

    }

    public Animal findRacingWinner(Animal horse, Animal tiger, Animal dog) {
        System.out.println("horse speed: " + horse.getSpeed());
        System.out.println("tiger speed: " + tiger.getSpeed());
        System.out.println("dog speed: " + dog.getSpeed());

        Animal winner = horse;

        if (winner.getSpeed() < tiger.getSpeed()) {
             winner = tiger;
        }
        if (winner.getSpeed() < dog.getSpeed()) {
            winner = dog;
        }
        return winner;
    }
}
