package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private boolean operation;

    public Surgeon(boolean operation, String diagnosis,
                   String name, String surname, String education, String birthday) {
        super(diagnosis, name, surname, education, birthday);
        this.operation = operation;
    }

    public boolean successfulOperation() {
        return operation;
    }

}
