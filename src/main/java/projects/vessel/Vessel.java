package projects.vessel;

import projects.material.Material;

public abstract class Vessel {

    private double volume;
    private double parameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double parameter, Material material) {
        this.volume = volume;
        this.parameter = parameter;
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getParameter() {
        return parameter;
    }

    public void setParameter(double parameter) {
        this.parameter = parameter;
    }

    public int getWeight() {
        weight = (int) (material.getDensity() * volume / 4);
        return weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
