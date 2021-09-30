package ru.job4j.oop.vehicles;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle firstAir = new Airplane();
        Vehicle secondAir = new Airplane();
        Vehicle firstTrain = new Train();
        Vehicle secondTrain = new Train();
        Vehicle thirdTrain = new Train();
        Vehicle firstBus = new Bus();
        Vehicle secondBus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{firstAir, secondAir, firstTrain,
                secondTrain, thirdTrain, firstBus, secondBus};

        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
