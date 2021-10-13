package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(-1, -3, 4, 5, 6, -99, 12));
        List<Integer> result = numbers.stream().filter(
                integer -> integer > 0
        ).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}

