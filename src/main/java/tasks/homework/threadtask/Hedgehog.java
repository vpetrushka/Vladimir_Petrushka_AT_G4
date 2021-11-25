package tasks.homework.threadtask;

public class Hedgehog {

    private String pattern = "Hedgehog <%d>";
    private String name;

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
