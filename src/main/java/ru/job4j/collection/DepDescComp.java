package ru.job4j.collection;

import java.util.Comparator;
import java.util.Map;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        for (int index = 0; index < Math.min(o1.length(), o2.length()); index++) {
            Character leftChar = o1.charAt(index);
            Character rightChar = o2.charAt(index);
            if (rightChar.compareTo(leftChar) != 0) {
                return rightChar - leftChar;
            }
        }
        return o1.length() - o2.length();
    }

}