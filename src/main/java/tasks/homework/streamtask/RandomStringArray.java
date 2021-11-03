package tasks.homework.streamtask;

import java.security.SecureRandom;

public class RandomStringArray {

    final String AB = "abcdefghijklmnopqrstuvwxyz";
    SecureRandom rnd = new SecureRandom();

    String randomString() {
        StringBuilder sb = new StringBuilder(7);
        for (int i = 0; i < 7; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

}
