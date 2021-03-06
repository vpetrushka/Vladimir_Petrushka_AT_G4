package tasks.homework.basetask;
//- создать класс TrainMethodsReturn и в нем
//-- создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это число умноженное на 3
//-- создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это число минус 4
//-- создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из двух таки символов
//-- создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает это число деленное на 2
//-- создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает это число плюс 8
//-- создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это число минус 1
//-- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это число умноженное на 2
//-- создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и возвращает обратное булево
//-- создать в раннере TrainMethodsReturnRunner обьект класса TrainMethodsPrimitive, и отпечатать в консоль значение, возвращаемое каждым из методов в виде "метод <название метода> вернул " и возвращаемое значение


public class TrainMethodsReturn {

    public int returnNewInt(int integerNumber) {
        return integerNumber * 3;
    }

    public long returnNewLong(long longNumber) {
        return longNumber - 4;
    }

    public String returnNewChar(char charDigit) {
        return (charDigit + "" + charDigit);
    }

    public float returnNewFloat(float floatNumber){
        return floatNumber/2;
    }

    public double returnNewDouble(double doubleNumber){
        return doubleNumber+8;
    }

    public short returnNewShort(short shortNumber){
        return (short)(shortNumber-1);
    }

    public byte returnNewByte(byte byteNumber){
        return (byte) (byteNumber*2);
    }

    public boolean returnNewBoolean(boolean booleanValue){
        return !booleanValue;
    }
}
