package projects.vessel;

import projects.objects.materials.Material;

public abstract class Vessel {

    private double volume;
    private double parameter;
    private int weight;
    private Material material;

    public Vessel(double volume, double parameter, int weight, Material material) {
        this.volume = volume;
        this.parameter = parameter;
        this.weight = weight;
        this.material = material;
        this.weight = (int) (material.getDensity() * volume / 4);
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
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
