package courses.lesson02;

public class Glass {

    private int fullVolume;
    private String colour;
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

