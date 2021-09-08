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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
        }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        items[index].setId(id);
        items[index].setName(item.getName());
        return index != -1;
    }

}