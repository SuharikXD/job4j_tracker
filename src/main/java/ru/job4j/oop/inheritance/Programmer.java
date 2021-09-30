package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private int decisionTime;

    public Programmer(int decisionTime, String hairColor, String name,
                      String surname, String education, String birthday) {
        super(hairColor, name, surname, education, birthday);
        this.decisionTime = decisionTime;
    }

    public int time() {
        return decisionTime;
    }
}
