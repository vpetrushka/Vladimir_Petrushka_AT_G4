package projects.objects.forliquids;

import projects.material.Material;
import projects.vessel.Vessel;

public class VesselBox<T> extends Vessel {


    public VesselBox(double volume, double parameter, Material material) {
        super(volume, parameter, material);
    }
}
