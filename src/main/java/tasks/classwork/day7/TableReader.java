package tasks.classwork.day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TableReader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("table1");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Table table = (Table) objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(table.toString());
    }
}
