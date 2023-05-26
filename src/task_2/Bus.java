package task_2;

import task_2.Vehicle;

public class Bus extends Vehicle {
    public Bus(int maxSpeed){
        super(maxSpeed, "Bus");
    }
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
