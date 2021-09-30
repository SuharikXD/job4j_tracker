package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String diagnosis;

    public Doctor(String diagnosis, String name, String surname,
                  String education, String birthday) {
        super(name, surname, education, birthday);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }
}
