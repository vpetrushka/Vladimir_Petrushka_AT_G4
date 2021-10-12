package tasks.homework.cycletask;
//- используя while вывести в консоль все числа от 0 до 20 в 1 строку через пробел
public class CountUsingWhile {

    public void listNumbersUsingWhile(){
        int a = 0;
        while (a < 21) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
    }
}
