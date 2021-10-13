package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void firstMatrixTest() {
        Integer[][] mat = new Integer[2][2];
        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[1][0] = 3;
        mat[1][1] = 4;
        Matrix matrix = new Matrix();
        List<Integer> rsl = matrix.conversion(mat);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(rsl, is(expected));
    }
}