package com.javalesson.inheritance;

public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;
    private int currentSpeed;
    protected boolean isRunning;

    public Auto(String producer, String model, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.engine = engine;
        System.out.println("An auto was initialized.");
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("The auto has started.");
    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("The auto has stopped.");
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate(int kmhPerHour) {
        currentSpeed = currentSpeed + kmhPerHour;
        System.out.println("Accelerating. Current speed is: " + currentSpeed + " kmh per hour");
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engine +
                ", currentSpeed=" + currentSpeed +
                ", isRunning=" + isRunning +
                '}';
    }

    public abstract void energize();

    public static void doSomething(){}
}
