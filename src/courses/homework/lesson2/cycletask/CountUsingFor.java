package courses.homework.lesson2.cycletask;
//- используя for вывести в консоль каждое нечетное число от 3 до 19 включительно
public class CountUsingFor {

    public void listNumbersUsingFor(){
        for (int i = 3; i < 20; i++) {
            if (i % 2 != 0){
            System.out.print(i + " ");}
        }
        System.out.println();
    }
}
