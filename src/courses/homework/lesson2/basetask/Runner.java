package courses.homework.lesson2.basetask;

import java.util.Random;

public class Runner {


    public static void main(String[] args) {

        String stringValue = "Random string name";
        byte numberValue = 10;
        float fractionalNumber = 8.75F;
        boolean booleanValue = true;
        char charDigit = 'Z';

        TrainMethodsString trainMethodsString = new TrainMethodsString();
        TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();
        TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
        TrainMethodsIf trainMethodsIf = new TrainMethodsIf();
        TrainMethodsObjects trainMethodsObjectsRunner = new TrainMethodsObjects();

        trainMethodsString.printMama();
        trainMethodsString.printPapa();
        trainMethodsString.printString(stringValue);
        trainMethodsString.printMamaString(stringValue);

        trainMethodsPrimitive.printInt(numberValue);
        trainMethodsPrimitive.printLong(numberValue);
        trainMethodsPrimitive.printChar(charDigit);
        trainMethodsPrimitive.printFloat(fractionalNumber);
        trainMethodsPrimitive.printDouble(fractionalNumber);
        trainMethodsPrimitive.printShort(numberValue);
        trainMethodsPrimitive.printByte(numberValue);
        trainMethodsPrimitive.printBoolean(booleanValue);

        System.out.println("\nметод returnNewInt вернул " + trainMethodsReturn.returnNewInt(numberValue));
        System.out.println("метод returnNewLong вернул " + trainMethodsReturn.returnNewLong(numberValue));
        System.out.println("метод returnNewChar вернул " + trainMethodsReturn.returnNewChar(charDigit));
        System.out.println("метод returnNewFloat вернул " + trainMethodsReturn.returnNewFloat(fractionalNumber));
        System.out.println("метод returnNewDouble вернул " + trainMethodsReturn.returnNewDouble(fractionalNumber));
        System.out.println("метод returnNewShort вернул " + trainMethodsReturn.returnNewShort(numberValue));
        System.out.println("метод returnNewByte вернул " + trainMethodsReturn.returnNewByte(numberValue));
        System.out.println("метод returnNewBoolean вернул " + trainMethodsReturn.returnNewBoolean(booleanValue));

        System.out.println("\nметод returnNewInt вернул " + trainMethodsIf.returnNewInt(numberValue));
        System.out.println("метод returnNewLong вернул " + trainMethodsIf.returnNewLong(numberValue));
        System.out.println("метод returnNewChar вернул " + trainMethodsIf.returnNewChar(charDigit));
        System.out.println("метод returnNewFloat вернул " + trainMethodsIf.returnNewFloat(fractionalNumber));
        System.out.println("метод returnNewDouble вернул " + trainMethodsIf.returnNewDouble(fractionalNumber));
        trainMethodsIf.returnNewBoolean(booleanValue);

        trainMethodsObjectsRunner.processBee(new Bee("male", 3));
        trainMethodsObjectsRunner.processMouse(new Mouse("Gary", 12));
        trainMethodsObjectsRunner.processObstacle(new Obstacle("загруженность", "высоковато"));
        trainMethodsObjectsRunner.processPineapple(new Pineapple("highest", 345.33));
        trainMethodsObjectsRunner.processSouce(new Souce("katsup", "red"));

    }
}
