Домашнее задание №1 
ДЗ JAVA

Цель:
Практика с Java.

Описание/Пошаговая инструкция выполнения домашнего задания:

#1) Создайте родительский класс Animal
##Свойства:
name, age, weight, color
##Методы:
Getter and Setter
Say(Вывод на экран: «Я говорю»),
Go(Вывод на экран: «Я иду»),
Drink(Вывод на экран: «Я пью»),
Eat(Вывод на экран: «Я ем»)
##Переопределите метод toString (Возврат строки: «Привет! Меня зовут name, мне age лет(/год/года), я вешу - weight кг, мой цвет - color») лет или год, или года должно быть выбрано в зависимости от числа
Примеры:
Привет! Меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
Привет! Меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
Привет! Меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный

#2) Создайте интерфейс Flying
##Методы:
Fly

#3) Создайте класс Cat, унаследуйте его от Animal
Переопределить метод Say(Вывод на экран: «Мяу»)

#4) Создайте класс Dog, унаследуйте его от Animal
Переопределить метод Say(Вывод на экран: «Гав»)

#5) Создайте класс Duck, унаследуйте его от Animal, реализуйте интерфейс Flying
Переопределить метод Say(Вывод на экран: «Кря»)
Реализовать метод Fly(Вывод на экран: «Я лечу»)

#6) В основной программе:
Создайте ArrayList Animal
##Создайте в консоли меню, при входе в приложение на экран выводится запрос команды add/list/exit
Команды оформить в enum
При вводе команды она должна быть регистронезависимой и обрезать пробелы в начале и конце
##Если add
спросить какое животное (cat/dog/duck)
Спросить имя, возраст, вес, цвет
Инициализировать класс, добавить экземпляр в ArrayList и вызвать метод Say()
Вернуться к главному меню
##Если list
Вывести на экран метод toString() для всех элементов массива
##Если exit
выйти из программы.

Компетенции:
Синтаксис Java
- использовать абстрактные классы
