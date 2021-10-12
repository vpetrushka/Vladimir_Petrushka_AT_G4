package tasks.classwork.day4;

public class Teacher implements Speakable{

    public void speak(String phrase) {
        System.out.println("Talking with smart face phrase: " + phrase);
    }

    public void shout(String phrase) {
        System.out.println("Shouting twice " + phrase + phrase);
    }
}
