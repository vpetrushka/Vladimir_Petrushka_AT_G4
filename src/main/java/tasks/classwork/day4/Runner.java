package tasks.classwork.day4;

public class Runner {

    public static void main(String[] args) {

        new Dog().speak("give me money");
        new Person().speak("give me money");
        new Teacher().speak("give me money");

        Person person = new Men();
        Men men = new Men();

        men.justDoIt();

        speakAnySpeakable(new Dog());
        speakAnySpeakable(new Person());
        speakAnySpeakable(new Teacher());
        speakAnySpeakable(person);

    }

    private  static  void speakAnySpeakable(Speakable speakable){
        speakable.speak("I'm tired");
    }
}
