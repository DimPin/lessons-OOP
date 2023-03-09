package src.impl;

import src.Animal;
import src.interfaces.Flyable;
import src.interfaces.Illable;

public class Eagle extends Animal implements Flyable, Illable {
    public Eagle(String name) {
        super(name);
    }
    
    @Override
    public void speak() {}

    @Override
    public void hunt() {}

    @Override
    public int getFlightSpeed() {
        return 100;
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел%n", this.getType());
    }
}
