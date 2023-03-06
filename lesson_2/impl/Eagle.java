package lesson_2.impl;

import lesson_2.Animal;
import lesson_2.Flyible;
import lesson_2.Illable;

public class Eagle extends Animal implements Flyible, Illable {
    public Eagle(String name) {
        super(name);
    }
    
    @Override
    public void speak() {
        
    }

    @Override
    public void hunt() {
        
    }

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {
        
    }
}
