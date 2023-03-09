package src.impl;

import src.Animal;
import src.interfaces.Illable;
import src.interfaces.Runnable;

public class Cat extends Animal implements Illable, Runnable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }
    
    public void fly() {
        System.out.println("Разбегается, подпрыгивает и падает на пол...");
    }

    public void swim() {
        System.out.println("Бултыхется в воде...");
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

    public void getIll() {
        System.out.printf("%s заболел%n", this.getType());
    }

    @Override
    public int getRunSpeed() {
        // TODO Auto-generated method stub
        return 45;
    }
}
