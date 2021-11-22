package projects.material;

public enum Material {

    GLASS, PLASTIC, METAL;

    private double thermalConductivity;
    private String color;
    private double density;

    private void Glass() {
        this.thermalConductivity = 0.017;
        this.color = "green";
        this.density = 2200;
    }

    private void Plastic() {
        this.thermalConductivity = 0.2;
        this.color = "white";
        this.density = 1800;
    }

    private void Metal() {
        this.thermalConductivity = 58.0;
        this.color = "silver";
        this.density = 7800;
    }

}

