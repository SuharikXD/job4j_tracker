package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private int badTeeth;

    public Dentist(int badTeeth, String Diagnosis, String name, String surname, String education, String birthday) {
        super(Diagnosis, name, surname, education, birthday);
        this.badTeeth = badTeeth;
    }

    public int badTeeths() {
        return badTeeth;
    }
}
