package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic simon = new DummyDic();
        System.out.println(simon.engToRus("Unknown"));
    }
}
