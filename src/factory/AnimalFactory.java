package factory;

import animals.Animal;
import animals.birds.Duck;
import animals.pets.Cat;
import animals.pets.Dog;
import data.AnimalTypeData;
import data.ColorData;

public class AnimalFactory extends Animal {

    public AnimalFactory(String name, int age, int weight, ColorData color) {
        super(name, age, weight, color);
    }

    public static Animal createAnimal(AnimalTypeData animalTypeData, String name, int age, int weight, ColorData color) {
        switch (animalTypeData) {
            case CAT:
                return new Cat(name, age, weight, color);
            case DOG:
                return new Dog(name, age, weight, color);
            case DUCK:
                return new Duck(name, age, weight, color);
        }
        return null;
    }
}


