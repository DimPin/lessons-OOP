package homework_2.impl;

import homework_2.Animal;
import homework_2.Flyable;
import homework_2.Illable;
import homework_2.Runnable;
import homework_2.Swimable;

public class Duck extends Animal implements Flyable, Illable, Swimable, Runnable {
    public Duck(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println();
    }

    @Override
    public void hunt() {
        // TODO Auto-generated method stub
        System.out.println();
    }

    @Override
    public int getFlightSpeed() {
        // TODO Auto-generated method stub
        return 30;
    }

    @Override
    public void getIll() {
        // TODO Auto-generated method stub
        System.out.printf("%s заболел%n", this.getType());
    }

    @Override
    public int getSwimSpeed() {
        // TODO Auto-generated method stub
        return 20;
    }

    @Override
    public int getRunSpeed() {
        // TODO Auto-generated method stub
        return 15;
    }
}
