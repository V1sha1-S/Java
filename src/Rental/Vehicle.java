package Rental;

abstract class Vehicle {
    private String Model;
    private String Colour;
    private double baseRate;

    abstract double calculateRent(int days);

    public Vehicle(String Model, String Colour, double baseRate) {
        this.Model = Model;
        this.Colour = Colour;
        this.baseRate = baseRate;
    }

    public String getModel() {
        return Model;
    }

    public String getColour() {
        return Colour;
    }

    public double getBaseRate() {
        return baseRate;
    }

}
