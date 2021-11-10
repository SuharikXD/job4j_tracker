package ru.job4j.stream;

public class Car {
    private String bodyType;
    private int engineCapacity;
    private int maxSpeed;
    private String color;
    private int productionYear;

    static class Builder {
        private String bodyType;
        private int engineCapacity;
        private int maxSpeed;
        private String color;
        private int productionYear;

        Builder buildBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        Builder buildEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        Builder buildMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.bodyType = bodyType;
            car.engineCapacity = engineCapacity;
            car.maxSpeed = maxSpeed;
            car.color = color;
            car.productionYear = productionYear;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{"
                + "bodyType='" + bodyType + '\''
                + ", engineCapacity=" + engineCapacity
                + ", maxSpeed=" + maxSpeed
                + ", color='" + color + '\''
                + ", productionYear=" + productionYear
                + '}';
    }

    public static void main(String[] args) {
        Car car = new Builder().buildBodyType("BodyType")
                .buildEngineCapacity(2)
                .buildColor("color")
                .buildMaxSpeed(200)
                .buildProductionYear(1900)
                .build();
        System.out.println(car);
    }
}
