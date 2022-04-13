package com.epam.trebnikov.annotations;

public class PassengerCar extends Auto {

    @Override
    public void startModern(boolean engineCondition) {
        super.startModern(engineCondition);
    }

    public void startModern(boolean engineCondition, boolean openDoors) {
        System.out.println(engineCondition && openDoors ? "Start car!" : "Some engine errors");
    }


    @Override
    public void stop() {
        System.out.println("Car stop!");
    }
}
