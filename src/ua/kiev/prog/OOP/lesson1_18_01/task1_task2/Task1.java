package ua.kiev.prog.OOP.lesson1_18_01.task1_task2;

public class Task1 {

    public static void main(String[] args) {
        /*
        1. Написать класс Circle (круг) по аналогии с Rectangle и метод, который будет возвращать его площадь.
        2. Написать класс, который умеет считать количество созданных объектов этого класса(static).

        Result:
        1st and 2nd tasks joined. We are able to get Circle square and amount of instances.
        */
        Circle circle = new Circle(3.5);
        System.out.println("Square of the 1st Circle:" + circle.getSquare());
        Circle circle2 = new Circle(4.5);
        System.out.println("Square of the 2nd Circle:" + circle2.getSquare());
        Circle circle3 = new Circle(101);
        System.out.println("Square of the 3rd Circle:" + circle3.getSquare());
        System.out.println("Amount of instances:" + Circle.getInstancesAmount());

    }


}
