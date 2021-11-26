package projects.objects.forliquids;

import projects.objects.materials.Material;
import projects.vessel.Vessel;

public class VesselBox<T> extends Vessel {


    public VesselBox(double volume, double parameter, int weight, Material material) {
        super(volume, parameter, weight, material);
    }
}
