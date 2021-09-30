package ru.job4j.oop.vehicles;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус едет по дороге...");
    }
}
