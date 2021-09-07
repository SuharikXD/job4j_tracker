package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private int DecisionTime;

    public Programmer(int DecisionTime, String HairColor, String name, String surname, String education, String birthday) {
        super(HairColor, name, surname, education, birthday);
        this.DecisionTime = DecisionTime;
    }

    public int Time() {
        return DecisionTime;
    }
}
