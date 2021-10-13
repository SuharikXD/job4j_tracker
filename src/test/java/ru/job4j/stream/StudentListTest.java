package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentListTest {
    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student(20, "Surname2"),
                new Student(30, "Surname3"),
                new Student(20, "Surname2")
        );
        StudentList st = new StudentList();
        Map<String, Student> rsl = st.sortStud(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Surname2", new Student(20, "Surname2"));
        expected.put("Surname3", new Student(30, "Surname3"));
        assertThat(rsl, is(expected));
    }
}