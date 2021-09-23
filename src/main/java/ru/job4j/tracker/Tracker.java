package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    ArrayList<Item> items = new ArrayList<>();
    private int ids = 0;
    private int size = 0;

    public Item add(Item item) {
        items.add(item);
        item.setId(ids++);
        return item;
    }

    public ArrayList<Item> findAll() {
        return items;
    }

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item i : items) {
            if(i.getName().contains(key)) {
                result.add(i);
            }
        }
        return result;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (Item i : items) {
            if (i.getId() == id) {
                rsl = i.getId();
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
        }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.set(id, item);
        }
        return rsl;
    }
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl){
            items.remove(index);
        }
        return rsl;
    }
}