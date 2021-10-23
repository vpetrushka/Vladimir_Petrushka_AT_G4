package tasks.classwork.day7;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {

//        read();
//        write();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (Objects.equals(incoming, "quit")) {
                break;
            } else {
                System.out.printf("Just got '%s' next!", incoming);
                System.out.println();
            }
        }
    }


    public static void read() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("MyFile.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public static void write() throws IOException {
        BufferedWriter out = new BufferedWriter((new FileWriter("NewFile.txt")));
        out.write("hello my friend\n\n Hello again \n\n Hello my friend \n\n Hi \n\n Kek lol azaza");
        out.newLine();
        out.newLine();
        out.write("Again");
        out.close();
    }


}