package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Zykov Danil Aleksandrovich");
        student.setGroup("job4j");
        student.setDate("24.08.2021");

        System.out.println(
                "Student " + student.getFio() + " has been in the " + student.getGroup() + " group since " + student.getDate()
        );
    }
}
