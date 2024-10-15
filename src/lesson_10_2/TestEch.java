package lesson_10_2;

public class TestEch {

    public static void main(String[] args) {
        Ech ech;

        boolean isEnoughTime = true;

        // Transition to take another form -> Polymorphism
        if (isEnoughTime) {
            ech = new NongNoc();
        } else {
            ech = new TrungEch();
        }
    }
}
