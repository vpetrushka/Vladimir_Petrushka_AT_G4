package tasks.homework.arraysandsets;

//Создать набор строк стрингов cars из 7 авто (Мерс, Ауди, Жигуль, Рено, Жигуль, Жигуль, Ауди) через (Sets.newHashSet())
//Проитерировать список через for-each и отпечатать слова в файл cars через с новой строки в кавычках
//Найти и удалить из набора авто, в названии которых больше 4 букв
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//
//import com.google.common.collect.Sets;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Set;
//
//public class Cars {
//
//    public static void main(String[] args) throws IOException {
//
//        Set<String> cars = Sets.newHashSet("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");
//        BufferedWriter out = new BufferedWriter((new FileWriter("cars")));
//
//        for (String car : cars) {
//            out.write("\"" + car + "\"" + "\n");
//        }
//        out.close();
//
//        cars.removeIf(st -> st.length() > 4);
//
//        for (String st : cars) {
//            System.out.print(st + " ");
//        }
//
//    }
//}