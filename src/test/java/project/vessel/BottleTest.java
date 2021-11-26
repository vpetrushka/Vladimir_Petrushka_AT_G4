package project.vessel;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import projects.material.Glass;
import projects.objects.materials.Material;
import projects.objects.materials.Plastic;
import projects.vessel.Bottle;
import projects.vessel.Vessel;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class BottleTest {

    double volume, parameter, bubbleVolume;
    int weight;
    Vessel vessel;

    public BottleTest(Vessel vessel, double volume, double parameter, int weight, Material material, double bubbleVolume) {
        this.vessel = vessel;
        this.volume = volume;
        this.parameter = parameter;
        this.weight = weight;
        this.bubbleVolume = bubbleVolume;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {

        return
                Arrays.asList(new Object[][]{
                        {new Bottle(10.0, 15.0, 25, new Glass()), 10, 15, 25, new Glass(), 25000},
//                        {new Bottle(10.0,15.0, 25, new Plastic())}
                });
    }

    @Test
    public void bottleGetVolumeTest() {
        Assert.assertEquals( volume, vessel.getVolume(),0.0);
    }

    @Test
    public void bottleGetParameterTest() {
        Assert.assertEquals("Expected parameter is incorrect", parameter, vessel.getParameter());
    }


}
