package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentList {
    public Map<String, Student> sortStud(List<Student> students) {
        Map<String, Student> rsl = students.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (s1, s2) -> s1
                ));
        return rsl;
    }
}
