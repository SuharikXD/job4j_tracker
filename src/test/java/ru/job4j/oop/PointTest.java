package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void testMain() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance3d(b);
        double expected = 2.0;
        Assert.assertEquals(rsl, expected, 0.001);
    }
}