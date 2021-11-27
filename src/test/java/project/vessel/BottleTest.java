package project.vessel;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import projects.material.Material;
import projects.vessel.Bottle;
import projects.vessel.Vessel;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class BottleTest {

    double volume, parameter, bubbleVolume;
    int weight;
    Vessel vessel;
    Material material;

    public BottleTest(Vessel vessel, double volume, double parameter, int weight, Material material, double bubbleVolume) {
        this.vessel = vessel;
        this.volume = volume;
        this.parameter = parameter;
        this.weight = weight;
        this.material = material;
        this.bubbleVolume = bubbleVolume;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {

        return
                Arrays.asList(new Object[][]{
                        {new Bottle(10.0, 15.0, Material.GLASS), 10, 15, 5500, Material.GLASS, 100000},
                        {new Bottle(22.5,33.3, Material.PLASTIC),22.5,33.3,10125,Material.PLASTIC,225000}
                });
    }

    @Test
    public void vesselGetVolumeTest() {
        Assert.assertEquals("Volume is incorrect",volume, vessel.getVolume(),0.0);
    }

    @Test
    public void vesselGetParameterTest() {
        Assert.assertEquals("Parameter is incorrect",parameter, vessel.getParameter(), 0.0);
    }

    @Test
    public void vesselGetWeightTest() {
        Assert.assertEquals("Weight is incorrect", weight, vessel.getWeight(),0.0);
    }

    @Test
    public void vesselSetVolumeTest() {
        vessel.setVolume(35.5);
        Assert.assertEquals("Volume is incorrect",35.5, vessel.getVolume(), 0.0);
    }

    @Test
    public void vesselSetParameterTest() {
        vessel.setParameter(35.5);
        Assert.assertEquals("Parameter is incorrect",35.5, vessel.getParameter(), 0.0);
    }

    @Test
    public void vesselSetMaterialTest() {
        vessel.setMaterial(Material.PLASTIC);
        Assert.assertEquals("Material does not match", Material.PLASTIC, vessel.getMaterial());
    }

    @Test
    public void vesselGetMaterialTest() {
        Assert.assertEquals("Material does not match", material, vessel.getMaterial());
    }

}
