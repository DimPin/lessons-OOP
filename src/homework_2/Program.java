package src.homework_2;

import src.impl.Cat;
import src.impl.Dog;
import src.impl.Duck;
import src.impl.Eagle;
import src.impl.VetClinic;

// Создать класс Doctor. Создайте интерфейсы Runnable, Flyable, Swimable. У интерфейсов должны быть
// методы получения скорости заданного действия.

// Добавьте наследников этим интерфейсам, но таким образом,
// чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)

// У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих, всех говорящих и всех летающих и вообще всех животных.

// Постарайтесь максимально логично переписать архитектуру проекта.

public class Program {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic.addRunnable(new Cat("Мурзик", "чёрный"));
        vetClinic.addFlyable(new Duck("Вася", "белый"));
        vetClinic.addFlyable(new Eagle("Яков"));
        vetClinic.addSwimable(new Dog("Шарик", "рыжий"));
        
        System.out.println(vetClinic.getFlyables());
        System.out.println(vetClinic.getRunnables());
        System.out.println(vetClinic.getSwimables());
    }    
}
