package AbstractInterface.Abstract;

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();

    abstract void makeSound();
}
