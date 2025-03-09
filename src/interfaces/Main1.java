package interfaces;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Runable> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);

        for (Runable animal: animals){
           animal.run();
        }
        AbleToFly ableToFly = new Bird();
        ableToFly.fly();
    }
}
