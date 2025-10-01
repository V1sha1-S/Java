package AbstractInterface.Abstract;

public class Elephant extends Animal {

    Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("eat grass");
    }

    @Override
    public void makeSound() {
        System.out.println("Make sound");
    }

}
