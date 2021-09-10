package ru.job4j.oop.Vehicles;

public class Airplane implements Vehicle{
    @Override
    public void move() {
        System.out.println("Самолет летит...");
    }
}
