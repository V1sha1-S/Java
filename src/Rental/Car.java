package Rental;

public class Car extends Vehicle {
    private boolean lux;

    public Car(String Model, String Colour, double baseRate, boolean lux) {
        super(Model, Colour, baseRate);
        this.lux = lux;
    }

    @Override
    double calculateRent(int days) {
        double rate = getBaseRate();
        if (lux) {
            rate *= 1.5;
        }
        return rate * days;
    }
}
