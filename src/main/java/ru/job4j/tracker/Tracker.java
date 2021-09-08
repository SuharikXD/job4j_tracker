package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[size];
        for (int i = 0; i < size; i++) {
            namesWithoutNull[i] = items[i];
        }
        return namesWithoutNull;
    }

    public Item[] findByName(String key) {
        Item[] findName = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(key.equals(items[i].getName())) {
                findName[i] = items[i];
                count++;
            }
        }
        findName = Arrays.copyOf(findName, count);
        return findName;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}