package tasks.homework.threadtask;

public class Hedgehog {

    private final String pattern = "Hedgehog <%d>";
    private final String name;

    public Hedgehog(int number){
        this.name = String.format(pattern + number);
    }

    public void tellMe(){
        System.out.println("I am " + this.name);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
