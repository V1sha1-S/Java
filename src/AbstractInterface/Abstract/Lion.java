package AbstractInterface.Abstract;

public class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Eat Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}