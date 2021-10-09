package courses.lesson02;

public class RunCount {

    public static void main(String[] args) {

  //      new Break().breaking();

   //     new Returning().returning();

  //     new ForEachDemo().makeAverage();

        Glass glass = new Glass(250, "Red");

        if (glass.isEmpty()){
            System.out.println("Our glass is empty");

        }
        else
            System.out.println("Our glass if not empty");


        glass.setEffectiveVolume(220);

        System.out.println("In the glass is " + glass.getEffectiveVolume() + " ml of water");
        System.out.println("Volume of the glass is " + glass.getFullVolume() + " ml");
        System.out.println("Colour of the glass is " + glass.getColour());

        if (glass.isEmpty()){
            System.out.println("Our glass is empty");

        }
        else
            System.out.println("Our glass if not empty");
    }
}