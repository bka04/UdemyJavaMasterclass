package com.brentaronsen.section7OOP2;

public class Car2 extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car2(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}
