package lessons_1;

import java.util.List;
import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 0);
        // System.out.println(animal.getColor());

        Animal animal1 = new Animal("Boris");
        // System.out.println(animal1.getPawsCount());

        Cat cat1 = new Cat("Мурзик", "серый");
        // System.out.println(animal1.getType());
        // System.out.println(cat1.getType());

        Animal cat2 = new Cat("Барсик", "рыжий");
        // cat2.speak();
        // animal1.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat2);
        animals.add(new Dog("Бобик", "серый"));
        animals.add(new Duck("Лена", "белая"));

        // animals.forEach(Animal::speak);

        // for (Animal a: animals) {
        //     if (a instanceof Duck) ((Duck) a).fly();
        //     System.out.println(a);
        // }

        cat1.hunt();
    }
}
