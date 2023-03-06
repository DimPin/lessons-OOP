package lesson_2.impl;

import java.util.ArrayList;
import java.util.List;

import lesson_2.Animal;

public class VetClinic {
    private List<Animal> animals;

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public VetClinic () {
        this.animals = new ArrayList<>();
    }
}