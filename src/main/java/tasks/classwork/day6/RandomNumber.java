package tasks.classwork.day6;

import java.util.Random;

public class RandomNumber {

    Random random = new Random(100);

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "RandomNumber{" +
                "random=" + random +
                '}';
    }
}
