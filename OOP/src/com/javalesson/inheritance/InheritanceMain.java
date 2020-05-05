package com.javalesson.inheritance;

import java.util.List;

public class InheritanceMain {
    public static void main(String[] args) {
        Engine truckEngine = new Engine(6.0, EngineType.DIESEL, 900);
        Engine busEngine = new Engine(3.5, EngineType.DIESEL, 150);
        Auto truck = new Truck("Volvo", "VNL-300", truckEngine, 300,
                500, 1000);
        Auto electricCar = new ElectricCar("Tesla", "S", 4,
                100500);
        Auto bus = new Bus("Mercedes", "Sprinter", busEngine, 30,
                75, 12);
//        Auto auto = new Auto("Wolfkswagen", "Polo", busEngine);
        bus.start();
        bus.stop();
        truck.start();
        truck.stop();
        runCar(bus);
        runCar(truck);
        runCar(electricCar);
//        runCar(auto);

    }

    private static void runCar(Auto auto){
        auto.start();
        auto.stop();
        auto.energize();
    }
}
