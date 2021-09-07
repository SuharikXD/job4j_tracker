package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String HairColor;

    public Engineer(String HairColor, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.HairColor = HairColor;
    }

    public String getHairColor() {
        return HairColor;
    }
}
