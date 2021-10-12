package tasks.classwork.day4;

public class Dog implements Speakable{

    public void speak(String phrase) {
        System.out.println("Dog's can't speak this phrase " + phrase);
    }

    public void shout(String phrase) {
        System.out.println("Bark! Bark! Bark! " + phrase);
    }
}
