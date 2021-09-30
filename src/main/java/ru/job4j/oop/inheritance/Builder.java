package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private int buildingExperience;

    public Builder(int buildingExperience, String hairColor,
                   String name, String surname, String education, String birthday) {
        super(hairColor, name, surname, education, birthday);
        this.buildingExperience = buildingExperience;
    }

    public int getBuildingExperience() {
        return buildingExperience;
    }
}
