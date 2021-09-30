package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Транспорт едет...");
    }

    @Override
    public void passengers(int pas) {
        System.out.println("В транспорте " + pas + " пассажиров");
    }

    @Override
    public int fuel(int quantity) {
        return quantity * 49;
    }
}
