package lesson_2.impl;

import lesson_2.Animal;
import lesson_2.Flyible;
import lesson_2.Illable;

public class Duck extends Animal implements Flyible, Illable {
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
        return 20;
    }

    @Override
    public void getIll() {
        // TODO Auto-generated method stub
        
    }
}
