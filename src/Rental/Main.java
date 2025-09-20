package Rental;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Defender Octa", "black", 3.5, true);

        System.out.println(car1.getModel() + " rent for 3 days " + car1.calculateRent(3));

    }
}
