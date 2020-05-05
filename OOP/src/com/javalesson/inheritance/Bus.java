package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePatrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePatrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus is constructing.");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePatrol();
        fuelUp(volume);
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("The bus has started.");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("The bus has stopped.");
    }

    @Override
    public void fuelUp(int patrolVolume) {
        int volume = getAvailablePatrol() + patrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePatrol(getTankVolume());
        }
        System.out.println("Adding diesel.");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassengers(int passengerNum) {
        passengerNumber =+ passengerNum;
        System.out.println("Picking up " + passengerNumber + " passengers.");
    }

    public void releasesPassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released.");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePatrol());

    }
}
