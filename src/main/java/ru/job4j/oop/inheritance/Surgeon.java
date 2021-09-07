package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private boolean operation;

    public Surgeon(boolean operation, String Diagnosis, String name, String surname, String education, String birthday) {
        super(Diagnosis, name, surname, education, birthday);
        this.operation = operation;
    }

    public boolean SuccessfulOperation () {
        return operation;
    }

}
