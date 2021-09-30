package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String hairColor;

    public Engineer(String hairColor, String name, String surname,
                    String education, String birthday) {
        super(name, surname, education, birthday);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
