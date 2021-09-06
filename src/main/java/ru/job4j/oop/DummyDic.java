package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String rsl = "Unknown";
        return rsl;
    }

    public static void main(String[] args) {
        DummyDic simon = new DummyDic();
        String eng = simon.engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }
}
