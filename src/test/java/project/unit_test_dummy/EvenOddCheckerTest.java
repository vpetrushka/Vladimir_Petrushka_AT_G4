package project.unit_test_dummy;

import org.junit.Assert;
import org.junit.Test;
import tasks.homework.unit_tests_dummy.EvenOddChecker;

public class EvenOddCheckerTest {

    @Test
    public void checkEven() {
        Assert.assertEquals("Numbers should be even", true, EvenOddChecker.check(10));
    }

    @Test
    public void oddEven() {
        Assert.assertEquals("Numbers should be odd", false, EvenOddChecker.check(9));
    }
}
