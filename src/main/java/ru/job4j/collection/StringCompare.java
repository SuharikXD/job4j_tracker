package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int count = 0;
        int rsl;
        do {
            char ch1 = left.charAt(count);
            char ch2 = right.charAt(count);
            rsl = Character.compare(ch1, ch2);
            count++;
        } while (rsl == 0 && count < left.length() && count < right.length());
        if (left.length() != right.length() && rsl == 0) {
            rsl = left.length() > right.length() ? 1 : -1;
        }
        return rsl;
    }
}