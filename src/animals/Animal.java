package animals;

import data.ColorData;

import static tools.NameValidator.capitalize;

public abstract class Animal {

    private String name;
    private int age;
    private int weight;
    private ColorData color;

    public Animal(String name, int age, int weight, ColorData color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(ColorData color) {
        this.color = color;
    }

    public ColorData getColor() {
        return color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String yearWord;
        int lastDigit = age % 10;

        if (age >= 11 && age <= 19) {
            yearWord = "лет";
        } else if (lastDigit == 1) {
            yearWord = "год";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            yearWord = "года";
        } else {
            yearWord = "лет";
        }

        return "Привет! Меня зовут " + capitalize(name) + ", мне " + age + " " + yearWord + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }
}

