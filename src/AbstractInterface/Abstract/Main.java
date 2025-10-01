package AbstractInterface.Abstract;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("Simba", 5),
                new Elephant("Jumbo", 10)
        };

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
        }

    }
}
