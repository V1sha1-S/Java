package AbstractInterface.abstractInterface;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new bike("Ducati"),
                new car("Defender")
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }

        electricCar ec = new electricCar("BYD");
        ec.move();
        ec.chargeBattery();
    }
}

class bike extends Vehicle {
    bike(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " moves fast");
    }
}

class car extends Vehicle {
    car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " moves on a moderate speed");
    }
}

interface chargeBattery {

    void chargeBattery();
}

class electricCar extends Vehicle implements chargeBattery {
    electricCar(String name) {
        super(name);
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " needs to be charged once the battery is low");
    }

    @Override
    void move() {
        System.out.println(name + " Moves at high speed without noice");
    }
}
