package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < left.length() && i < right.length(); i++) {
            char ch1 = left.charAt(i);
            char ch2 = right.charAt(i);
            if (ch1 != ch2) {
                rsl = Character.compare(ch1, ch2);
            }
        }
        return rsl == 0 ? Integer.compare(left.length(), right.length()) : rsl;
    }
}