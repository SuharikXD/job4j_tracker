package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int left = 1;
        int right = 2;
        int middle = 3;
        int result = Max.max(left, right, middle);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To23To3Then23() {
        int left = 12;
        int right = 23;
        int middle = 3;
        int result = Max.max(left, right, middle);
        int expected = 23;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To2To3Then12() {
        int left = 12;
        int right = 2;
        int middle = 3;
        int result = Max.max(left, right, middle);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To2To3To33Then33() {
        int left = 12;
        int right = 2;
        int middle = 3;
        int four = 33;
        int result = Max.max(left, right, middle, four);
        int expected = 33;
        Assert.assertEquals(result, expected);
    }
}