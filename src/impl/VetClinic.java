package src.impl;

import java.util.ArrayList;
import java.util.List;

import src.Animal;
import src.interfaces.Flyable;
import src.interfaces.Runnable;
import src.interfaces.Swimable;

public class VetClinic {
    private List<Animal> animals;
    private List<Flyable> flyables = new ArrayList<>();
    private List<Runnable> runnables = new ArrayList<>();
    private List<Swimable> swimables = new ArrayList<>();

    public VetClinic addFlyable(Flyable flyable) {
        this.flyables.add(flyable);
        return this;
    }
    
    public VetClinic addRunnable(Runnable runnable) {
        this.runnables.add(runnable);
        return this;
    }

    public VetClinic addSwimable(Swimable swimable) {
        this.swimables.add(swimable);
        return this;
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public VetClinic() {
        this.animals = new ArrayList<>();
    }

    public List<Runnable> getRunnables() {
        return runnables;
    }

    public List<Flyable> getFlyables() {
        return flyables;
    }

    public List<Swimable> getSwimables() {
        return swimables;
    }
}