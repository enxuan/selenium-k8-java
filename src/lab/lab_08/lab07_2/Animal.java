package lab.lab_08.lab07_2;

import java.security.SecureRandom;

public class Animal {
    public int realSpeed;


    public Animal(int maxSpeed) {
        realSpeed = new SecureRandom().nextInt(maxSpeed);
    }

    public int getSpeed() {
        return realSpeed;
    }
}
