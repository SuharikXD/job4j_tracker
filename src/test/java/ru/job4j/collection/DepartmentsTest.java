package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void depAscTest() {
        List<String> input = Arrays.asList("K2", "K1", "K2/SK1");
        List<String> expect = List.of("K1", "K2", "K2/SK1");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void depAscTwoTest() {
        List<String> input = Arrays.asList("K2", "K1/SK1", "K1", "K1/SK1/SSK1",
                "K2/SK1/SSK1", "K2/SK1/SSK2", "K2/SK1");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK1/SSK1",
                "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void depDescTest() {
        List<String> input = Arrays.asList("K2", "K1", "K2/SK1");
        List<String> expect = List.of("K2", "K2/SK1", "K1");
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }
}