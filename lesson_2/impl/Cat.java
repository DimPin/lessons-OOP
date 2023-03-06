package lesson_2.impl;

import lesson_2.Animal;
import lesson_2.Illable;

public class Cat extends Animal implements Illable {
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
}
