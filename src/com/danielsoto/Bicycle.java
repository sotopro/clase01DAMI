package com.danielsoto;

public class Bicycle implements Vehicle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    public void printStates() {
        System.out.println("Bicycle - Speed: " + speed + " Gear: " + gear);
    }
}