package lab.lab_08.lab07_2;

import java.security.SecureRandom;

public class Horse extends Animal{
    private final int MAX_SPEED = 75;

    @Override
    public int getSpeed() {
        realSpeed = new SecureRandom().nextInt(MAX_SPEED);
        return realSpeed;
    }
}
