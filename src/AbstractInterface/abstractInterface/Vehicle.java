package AbstractInterface.abstractInterface;

abstract class Vehicle {
    protected String name;

    Vehicle(String name) {
        this.name = name;
    }

    abstract void move();

}
