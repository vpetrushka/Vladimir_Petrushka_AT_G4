package courses.homework.lesson2.basetask;


public class TrainMethodsPrimitive {

    private int integerNumber;
    private long longNumber;
    private char charDigit;
    private float floatNumber;
    private double doubleNumber;
    private short shortNumber;
    private byte byteNumber;
    private boolean booleanValue;



    public void printInt(int integerNumber){
        this.integerNumber = integerNumber;
        System.out.println("я получил на вход число " + integerNumber);
    }

    public void printLong(long longNumber){
        this.longNumber = longNumber;
        System.out.println("я получил на вход длинное число " + longNumber);
    }

    public void printChar(char charDigit){
        this.charDigit = charDigit;
        System.out.println("я получил на вход символ " + charDigit);
    }

    public void printFloat(float floatNumber){
        this.floatNumber = floatNumber;
        System.out.println("я получил на вход дробное число " + floatNumber);
    }

    public void printDouble(double doubleNumber){
        this.doubleNumber = doubleNumber;
        System.out.println("я получил на вход длинное дробное число " + doubleNumber);
    }

    public void printShort(short shortNumber){
        this.shortNumber = shortNumber;
        System.out.println("я получил на вход короткое число " + shortNumber);
    }

    public void printByte(byte byteNumber){
        this.byteNumber = byteNumber;
        System.out.println("я получил на вход короткое число "+ byteNumber);
    }

    public void printBoolean(boolean booleanValue){
        this.booleanValue = booleanValue;
        System.out.println("я получил на вход булево " + booleanValue);
    }
}
