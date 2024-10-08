package lab.lab_08.lab07_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    private final int MAX_SPEED = 60;

    @Override
    public int getSpeed() {
        realSpeed = new SecureRandom().nextInt(MAX_SPEED);
        return realSpeed;
    }
}
