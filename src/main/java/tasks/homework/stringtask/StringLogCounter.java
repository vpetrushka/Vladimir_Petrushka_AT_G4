package tasks.homework.stringtask;

public class StringLogCounter {

    public static void main(String[] args) {
        StringLogCounter stringLogCounter = new StringLogCounter();
        stringLogCounter.StringCounter("access_log.2020.09.07 212.168.101.5 granted");
    }


    public void StringCounter(String log){

        String[] splitterLog = log.split(" ");

        StringBuilder ipAddresses = null;

        if (splitterLog[1].equals(String.valueOf(ipAddresses))){

        } else
        ipAddresses.insert(0,splitterLog[1]);

        System.out.println(ipAddresses);

    }
}
