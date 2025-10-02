package InheritanceMethodOverriding;

import java.util.Arrays;
import java.util.List;

public class Animal {
    public void makeSound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Dog make sound wof");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Cat make sound mew");
    }
}
class Main{
    public static void main(String[] args) {
        Animal[] animals = new  Animal[4];
        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Cat();

        for (Animal a : animals){
            a.makeSound();
        }

        List<Animal> animals1 = Arrays.asList(
                new Dog(),
                new Cat(),
                new Dog()
        );

        for (Animal a1 : animals1){
            a1.makeSound();
        }
    }
}