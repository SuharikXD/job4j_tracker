package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void itemSort() {
        List<Item> items = Arrays.asList(
                new Item(2, "Two"),
                new Item(4, "Four"),
                new Item(1, "First")
        );
        Collections.sort(items);
        List<Item> extended = Arrays.asList(
                new Item(1, "First"),
                new Item(2, "Two"),
                new Item(4, "Four")
        );
        assertEquals(items, extended);
    }

    @Test
    public void itemSortReverse() {
        List<Item> items = Arrays.asList(
                new Item(2, "Two"),
                new Item(4, "Four"),
                new Item(1, "First")
        );
        Collections.sort(items, Collections.reverseOrder());
        List<Item> extended = Arrays.asList(
                new Item(4, "Four"),
                new Item(2, "Two"),
                new Item(1, "First")
        );
        assertEquals(items, extended);
    }
}