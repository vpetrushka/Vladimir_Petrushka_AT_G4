package tasks.homework.basetask;

public class TrainMethodsIf {
    //-- создать метод returnNewInt, который принимает на вход целое число (int) и если оно меньше 8,
    // то возвращает это число умноженное на 7, в противном случае деленное на 4
    public int returnNewInt(int integerNumber){
        if (integerNumber < 8){
            integerNumber *= 7;
        }
        else {
            integerNumber /= 4;
        }
        return integerNumber;
    }
    //-- создать метод returnNewLong, который принимает на вход целое число (long) и если оно больше 300,
    // то возвращает это число минус 300, в противном случае плюс 20
    public long returnNewLong(long longNumber){
        if (longNumber > 300){
            longNumber -=300;
        }
        else {
            longNumber += 20;
        }
        return longNumber;
    }
    //-- создать метод returnNewChar, который принимает на вход символ (char) и если это 'g',
    // то возвращает строку "go", в противном случае строку из этого символа с префиксом "o"
    public String returnNewChar(char charDigit){
        if (charDigit == 'g' ){
            return "go";
        }
        else{
            return "o" + charDigit;
        }
    }
    //-- создать метод returnNewFloat, который принимает на вход дробное число (float) и если оно равно 0.67,
    // то возвращает это число, в противном случае число умноженное на 2
    public float returnNewFloat(float floatNumber){
        if (floatNumber == 0.67){
        }
        else {
            floatNumber *= 2;
        }
        return floatNumber;
    }
    //-- создать метод returnNewDouble, который принимает на вход дробное число (double) и если оно больше 30,
    // но меньше 80, то  возвращает это число плюс 87, если оно больше 80, но меньше 400,
    // то возвращает это число минус 87, а если оно больше 400, то деленное на 4

    public double returnNewDouble(double doubleNumber){

        if (30 < doubleNumber && doubleNumber < 80){
            return doubleNumber += 87;
        }

        if (80 < doubleNumber && doubleNumber < 400){
            return doubleNumber -= 87;
        }

        if (doubleNumber > 400 ){
            return doubleNumber/4;
        }

        return doubleNumber;
    }

    //-- создать невозвратный метод returnNewBoolean, который принимает на вход булево значение (boolean) и если оно
    // true то печатает в консоль "Я получил на вход значение истины", в противном случае печатает в консоль "Я получил на вход ложь"

    public void returnNewBoolean(boolean booleanValue){

        if (booleanValue){
            System.out.println("Я получил на вход значение истины");
        }
        else
            System.out.println("Я получил на вход ложь");
    }

}
