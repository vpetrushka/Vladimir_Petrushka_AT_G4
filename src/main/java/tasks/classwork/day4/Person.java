package tasks.classwork.day4;

public class Person implements Speakable {

    public void speak(String phrase) {
        System.out.println(phrase);
    }

    public void shout(String phrase) {
        System.out.println("RRRR " + phrase);
    }
}
