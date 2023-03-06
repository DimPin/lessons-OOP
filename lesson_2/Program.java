package lesson_2;

import java.util.ArrayList;
import java.util.List;

import lesson_2.impl.Cat;
import lesson_2.impl.Dog;
import lesson_2.impl.Duck;
import lesson_2.impl.Eagle;
import lesson_2.impl.Human;
import lesson_2.impl.VetClinic;

public class Program {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик", "чёрный"))
                .addAnimal(new Dog("Бобик", "чёрный"))
                .addAnimal(new Duck("Дональд", "белый"));

        List<Illable> illableList = new ArrayList<>();
        illableList.add(new Cat("Barsik", "white"));
        illableList.add(new Human());

        List<Flyible> flyibles = new ArrayList<>();
        flyibles.add(new Eagle("Gor"));
        flyibles.add(new Duck("Duck", "pink"));

        for (Flyible f : flyibles) {
            System.out.println(f.getFlightSpeed());
        }

        Animal.getAnimalsCount();
    }
}
