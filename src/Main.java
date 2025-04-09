import animals.Animal;
import animals.birds.Duck;
import data.AnimalTypeData;
import data.ColorData;
import data.CommandsData;
import factory.AnimalFactory;
import tools.NameValidator;
import tools.IntValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> commandsStr = new ArrayList<>();
        for (CommandsData commandsData : CommandsData.values()) {
            commandsStr.add(commandsData.name().toLowerCase());
        }

        while (true) {
            System.out.println(String.format("Введите команду: %s", String.join("/", commandsStr)));
            String input = scanner.nextLine().trim().toUpperCase();

            try {
                CommandsData command = CommandsData.valueOf(input);

                switch (command) {
                    case ADD:

                        ArrayList<String> animalTypeStr = new ArrayList<>();
                        for (AnimalTypeData animalTypeData : AnimalTypeData.values()) {
                            animalTypeStr.add(animalTypeData.name().toLowerCase());
                        }

                        while (true) {

                            AnimalTypeData animalTypeData = null;
                            boolean validAnimalType = false;
                            while (!validAnimalType) {
                                System.out.println(String.format("Введите тип животного: %s", String.join("/", animalTypeStr)));
                                String animalTypeInput = scanner.nextLine().trim().toUpperCase();
                                try {
                                    animalTypeData = AnimalTypeData.valueOf(animalTypeInput);
                                    validAnimalType = true;
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Неверный тип животного. Попробуйте снова.");
                                }
                            }

                            String name = "";
                            boolean validName = false;
                            while (!validName) {
                                System.out.println("Введите имя:");
                                name = scanner.nextLine();
                                if (NameValidator.isValid(name)) {
                                    validName = true;
                                } else {
                                    System.out.println("Некорректный формат имени. Имя должно состоять только из букв кириллицы.");
                                }
                            }


                            int age = 0;
                            boolean validAge = false;
                            while (!validAge) {
                                System.out.println("Введите возраст");
                                String ageInput = scanner.nextLine();
                                if (IntValidator.isValid(ageInput)) {
                                    age = Integer.parseInt(ageInput);
                                    validAge = true;
                                } else {
                                    System.out.println("Введенный возраст некорректный. Ожидается число от 0 до 99.");
                                }
                            }

                            int weight = 0;
                            boolean validWeight = false;
                            while (!validWeight) {
                                System.out.println("Введите вес:");
                                String weightInput = scanner.nextLine();
                                if (IntValidator.isValid(weightInput)) {
                                    weight = Integer.parseInt(weightInput);
                                    validWeight = true;
                                } else {
                                    System.out.println("Введенный вес некорректный. Ожидается целое число от 0 до 99.");
                                }
                            }

                            ColorData color = null;
                            boolean validColor = false;
                            while (!validColor) {
                                String availableColors = Arrays.stream(ColorData.values())
                                        .map(ColorData::getName)
                                        .collect(Collectors.joining(", "));
                                System.out.println("Введите цвет (" + availableColors + "):");
                                String colorInput = scanner.nextLine().trim().toLowerCase();
                                color = ColorData.fromString(colorInput);
                                if (color != null) {
                                    validColor = true;
                                } else {
                                    System.out.println("Введенный цвет некорректный. Попробуйте снова.");
                                }
                            }

                            Animal animal = AnimalFactory.createAnimal(animalTypeData, name, age, weight, color);
                            animals.add(animal);
                            animal.say();
                            if (animal instanceof Duck) {
                                ((Duck) animal).fly();
                            }
                            break;
                        }
                    case LIST:
                        for (Animal a : animals) {
                            System.out.println(a.toString());
                        }
                        break;
                    case EXIT:
                        System.out.println("Выход из программы.");
                        System.exit(0);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Неверная команда.");
            }
        }
    }
}

