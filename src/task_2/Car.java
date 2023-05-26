package task_2;

import task_2.Vehicle;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
