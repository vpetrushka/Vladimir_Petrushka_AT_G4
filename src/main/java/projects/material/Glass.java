package projects.material;

import projects.objects.materials.Material;

public class Glass extends Material {

    private double thermalConductivity;
    private String color;
    private double density;

    public Glass() {
        thermalConductivity = 0.017;
        color = "green";
        density = 2200;
    }

}