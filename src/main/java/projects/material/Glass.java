package projects.material;

import projects.objects.materials.Material;

public class Glass extends Material {

    private final double thermalConductivity;
    private final String color;
    private final double density;

    public Glass() {
        thermalConductivity = 0.017;
        color = "green";
        density = 2200;
    }

}