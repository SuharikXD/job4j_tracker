package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        List<String> list = Arrays.asList("a", "sd", "dddd", "asd");
        System.out.println(list);
        Collections.sort(list, cmpDescSize);
        System.out.println(list);
    }
}
