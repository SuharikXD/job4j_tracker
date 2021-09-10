package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int pas);

    int fuel(int quantity);
}
