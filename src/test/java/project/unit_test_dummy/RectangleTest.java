package project.unit_test_dummy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tasks.homework.unit_tests_dummy.Rectangle;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RectangleTest {

    Rectangle rectangle;
    double length, width;

    public RectangleTest(Rectangle rectangle, double length, double width) {
        this.rectangle = rectangle;
        this.length = length;
        this.width = width;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {

        return
                Arrays.asList(new Object[][]{
                        {new Rectangle(25, 25), 25, 25},
                        {new Rectangle(0.5, 1.33), 0.5, 1.33}
                });
    }

    @Test
    public void rectangleGetLengthTest() {
        Assert.assertEquals(length, rectangle.getLength(),0.0);
    }

    @Test
    public void rectangleGetWidthTest() {
        Assert.assertEquals(width, rectangle.getWidth(),0.0);
    }

    @Test
    public void rectangleSetLengthTest() {
        rectangle.setLength(25);
        Assert.assertEquals(25, rectangle.getLength(),0.0);
    }

    @Test
    public void rectangleSetWidthTest() {
        rectangle.setWidth(25);
        Assert.assertEquals(25, rectangle.getWidth(),0.0);
    }

    @Test
    public void rectangleAreaTest() {
        Assert.assertEquals(length*width, rectangle.getArea(),0.0);
    }
}