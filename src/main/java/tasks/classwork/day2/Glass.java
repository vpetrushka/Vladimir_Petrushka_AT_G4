package tasks.classwork.day2;

public class Glass {

    private final int fullVolume;
    private final String colour;
    private boolean isEmpty = true;
    private int effectiveVolume;

    public Glass(int fullVolume, String colour){
        this.fullVolume = fullVolume;
        this.colour = colour;
    }

    public int getFullVolume() {
        return fullVolume;
    }


    public String getColour() {
        return colour;
    }



    public boolean isEmpty() {
        return isEmpty;
    }



    public int getEffectiveVolume() {
        return effectiveVolume;
    }

    public void setEffectiveVolume(int effectiveVolume) {
        this.effectiveVolume = effectiveVolume;
        if (effectiveVolume > 0)
            this.isEmpty = false;
    }
}

