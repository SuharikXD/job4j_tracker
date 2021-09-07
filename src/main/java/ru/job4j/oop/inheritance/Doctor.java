package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private String Diagnosis;

    public Doctor(String Diagnosis, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.Diagnosis = Diagnosis;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }
}
