package ru.job4j.ex;

import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void when0to2then3() {
        Fact.calc(-3);
    }
}