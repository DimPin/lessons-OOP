package homework_2.impl;

import homework_2.Animal;
import homework_2.Illable;
import homework_2.Runnable;
import homework_2.Swimable;

public class Dog extends Animal implements Runnable, Swimable, Illable {
    public Dog (String name, String color) {
        super(name, color, 4);
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
    public int getRunSpeed() {
        // TODO Auto-generated method stub
        return 50;
    }

    @Override
    public int getSwimSpeed() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public void getIll() {
        // TODO Auto-generated method stub
        System.out.printf("%s заболел%n", this.getType());
    }
}
