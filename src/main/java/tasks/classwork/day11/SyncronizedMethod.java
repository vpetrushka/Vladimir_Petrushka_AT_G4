package tasks.classwork.day11;

public class SyncronizedMethod {

    public static synchronized void syncMethod(String thredName){

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.printf("%s - %s \r\n",thredName,i);
        }
    }

    public static void main(String[] args) {

        new Thread(() -> syncMethod("t1")).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        syncMethod("m");
    }
}
