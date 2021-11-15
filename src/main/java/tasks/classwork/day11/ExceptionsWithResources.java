package tasks.classwork.day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExceptionsWithResources {

    public static void main(String[] args) {

        try(

        FileOutputStream fos = new FileOutputStream("txt");

        ObjectOutputStream fis = new ObjectOutputStream(fos)){

        fis.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
   }
}
