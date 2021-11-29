package tasks.homework.threadtask;

public class Mouse {

    private final String pattern = "Mouse <%d>";
    private final String name;

    public Mouse(int number){
        this.name = String.format(pattern, number);
    }

    public void peep(){
        System.out.println(this.name + " PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
